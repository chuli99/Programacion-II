package ProductorConsumidor;

import java.util.Queue;

public class Almacenamiento {
    private Queue<Integer> buffer;
    private int capacidad;

    public Almacenamiento(Queue<Integer> buffer, int capacidad) {
        this.buffer = buffer;
        this.capacidad = capacidad;
    }

    public Almacenamiento() {
    }

    public Queue<Integer> getBuffer() {
        return buffer;
    }

    public void setBuffer(Queue<Integer> buffer) {
        this.buffer = buffer;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public synchronized void agregar(int valor) {
        while (buffer.size() == capacidad) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            buffer.add(valor);
            System.out.println("Productor agrega" + valor + "en la cola.");
            notifyAll();
            }
        }
        public synchronized int retirar(){
            while (buffer.isEmpty()){
                try{
                    wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            int valor = this.getBuffer().remove();
            System.out.println("Consumidor retira"+valor+" de la cola");
            notifyAll();
            return valor;
        }
    }
