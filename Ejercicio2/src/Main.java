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
        ListaGenerica<Empleado> lista = new ListaGenerica<>();
        lista.agregar(empleado);

        System.out.println(lista.devolver_Lista());
        System.out.println(lista.tamanio());
        //lista.ordenar_lista();
        //lista.desordenar_lista();
    }

    }
