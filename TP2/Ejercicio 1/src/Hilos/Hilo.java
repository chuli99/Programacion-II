package Hilos;
import java.util.Random;
public class Hilo extends Thread{
    private String nombre;
    public Hilo(String name){
        this.nombre = nombre;
    }

    @Override
    public void run(){
        Random random = new Random();
        for (int i = 0; i < 10 ; i++){
            int iteracion = random.nextInt(30) + 10;
            int demora = random.nextInt(950) +  50;
            System.out.println("Este es el hilo " + nombre + " y esta es la iteración "+ iteracion);
            try{
                Thread.sleep(demora);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
