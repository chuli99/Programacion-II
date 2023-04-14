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
        System.out.println(lista.tamanio());
    }

    }
