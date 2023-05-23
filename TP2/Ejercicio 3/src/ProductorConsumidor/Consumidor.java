package ProductorConsumidor;

import ProductorConsumidor.Almacenamiento;
import static  java.lang.Thread.sleep;

class Consumidor implements Runnable {
    private String nombre;
    private Almacenamiento almacenamiento;

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

    public Consumidor(String nombre, Almacenamiento almacenamiento) {
        this.nombre = nombre;
        this.almacenamiento = almacenamiento;
    }

    public Consumidor() {
    }

    @Override
    public void run() {
        int cantDeNumeros = this.almacenamiento.getCapacidad();
        for (int i = 0; i < cantDeNumeros; i++) {
            long fact = 1, num = this.almacenamiento.retirar();

            for (int j = 2; j < num + 1; j++) {
                fact = fact * j;
            }

            StringBuffer salida = new StringBuffer();
            salida.append("Hilo numero'" + this.getNombre() + "' procesando la cola. ");
            salida.append("Resultado: " + fact + ". ");
            salida.append("Se procesará/n " + (cantDeNumeros - i - 1) + " elemento/s más. ");

            System.out.println(salida);

            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException("Se interrumpió el programa.");
            }
        }
    }
}
