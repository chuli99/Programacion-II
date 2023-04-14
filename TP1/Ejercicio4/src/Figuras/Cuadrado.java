package Figuras;

import Interfaces.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public double calcularPerimetro() {
        return lado*4;
    }

    @Override
    public double calcularSuperficie() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "Perimetro= " + calcularPerimetro() +"\n"+
                "Superficie= " + calcularSuperficie() +"\n"+
                '}';
    }
}
