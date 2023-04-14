import Clases.Empleado;
import Clases.ListaGenerica;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }
    public void arranque(){
        Empleado empleado = new Empleado("Lionel","Messi",60031,15);
        Empleado empleado2 = new Empleado("Lionel","Messi",60031,15);
        Empleado empleado3 = new Empleado("Javier","Mascherano",60032,10);
        Empleado empleado4 = new Empleado("Eduardo","Gomez",60035,2);
        Empleado empleado5 = new Empleado("Enzo","Ferandez",60036,3);
        Empleado empleado6 = new Empleado("Dani","Balda",56039,10);
        Empleado empleado7 = new Empleado("Francisco","Balda",56038,8);
        ListaGenerica<Empleado> lista = new ListaGenerica<>();
        lista.agregar(empleado);
        lista.agregar(empleado2);
        lista.agregar(empleado3);
        lista.agregar(empleado4);
        lista.agregar(empleado5);
        System.out.println(lista.devolver_Lista());
        System.out.println(lista.tamanio());
        //lista.ordenar_lista();
        lista.desordenar_lista();
        lista.agregar_posicion((empleado6),2);
        System.out.println(lista.obtener_posicion(2));
        System.out.println(lista.obtener_primer_elemento());
        System.out.println(lista.obtener_ultimo_elemento());
        lista.remover_objeto(3);
        System.out.println(lista.devolver_Lista());

        //Generar Excepciones
        //Excepcion para agregegar fuera del rango
        try{
            lista.agregar_posicion(empleado7,7);
        } catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        //Excepcion para devolver objeto fuera del rango
        try{
            lista.obtener_posicion(8);

        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        //Excepcion para obtener primer elemento de una lista vacia
        lista.borrar_lista();

        try{
            lista.obtener_primer_elemento();
        }catch(IndexOutOfBoundsException e){
            System.out.printf(e.getMessage());
        }

        //Excepcion para remover objeto en posicion particular inexistente
        try{
            lista.remover_objeto(10);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

}
