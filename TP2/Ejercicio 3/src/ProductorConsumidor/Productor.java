package ProductorConsumidor;

class Productor implements Runnable {
    private String nombre;
    private Almacenamiento almacenamiento;
    private int cantidad;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Almacenamiento getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Productor(String nombre, Almacenamiento almacenamiento, int cantidad) {
        this.nombre = nombre;
        this.almacenamiento = almacenamiento;
        this.cantidad = cantidad;
    }

    public void run() {
        for (int i = 1; i <= cantidad; i++) {
            almacenamiento.agregar(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
