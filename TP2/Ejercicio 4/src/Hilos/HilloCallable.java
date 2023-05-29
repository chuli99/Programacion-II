package Hilos;

import java.util.concurrent.Callable;

public class HiloCallable implements Callable<Void> {
    private String nombre;
    private int iteration;
    private int delay;
    public HiloCallable() {
    }

    public HiloCallable(String nombre, int iteration, int delay {
        this.nombre = nombre;
        this.iteration = iteration;
        if(delay < 50 || delay > 999) {
            throw new RuntimeException("El valor de la demora debe encontrarse entre 50 y 999ms.");
        }
        this.delay = delay;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteraciones) {
        this.iteration = iteration;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        if(delay < 50 || delay > 999) {
            throw new RuntimeException("El valor de la demora debe encontrarse entre 50 y 999ms.");
        }
        this.delay = delay;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i < this.getIteration() + 1; i++) {
            System.out.println(String.format("Este es el hilo '%s' y esta es la iteración %s.", this.getNombre(), i));
            try {
                Thread.sleep(this.getDelay());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}