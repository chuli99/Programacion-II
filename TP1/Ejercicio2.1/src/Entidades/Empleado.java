package Entidades;

public class Empleado  {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Integer aniosTrabajados;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Integer getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(Integer aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }

    public Empleado(String nombre, String apellido, Integer legajo, Integer aniosTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        String data = "Empleado{" +
                "nombre='" + nombre + '\n' +
                ", apellido='" + apellido + '\n' +
                ", legajo=" + legajo + '\n' +
                ", aniosTrabajados=" + aniosTrabajados +
                "}\n";
        return data;
    }

}

