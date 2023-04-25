package Hilos;
import java.util.Random;

public class RunnableHilo implements Runnable {
    private String nombre;
    private int iteraciones;
    private int demora;

    public RunnableHilo(String nombre, int iteraciones, int demora) {
        this.nombre = nombre;
        this.iteraciones = iteraciones;
        this.demora = demora;
    }

    public void run() {
        Random random = new Random();
        for (int i = 1; i <= iteraciones; i++) {
            int iteration = random.nextInt(31) + 10;
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración " + i + ": " + iteration);
            try {
                Thread.sleep(demora);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}