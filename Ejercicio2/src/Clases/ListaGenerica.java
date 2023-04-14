package Clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListaGenerica<T> {
    private ArrayList<T> lista;

    public ListaGenerica() {
        lista = new ArrayList<T>();
    }
    public void agregar(T elemento){
        lista.add(elemento);

    }

    public ArrayList<T>devolver_Lista(){
        return lista;
    }

    public int tamanio(){
        return lista.size();
    }

    //Metodo para ordenar lista
    //public void ordenar_lista(){
    //    Collections.sort(lista);

    //Metodo para desordenar la lista
    //public void desordenar_lista(){
    //    Collections.shuffle(lista);
    //}

    //Metodo para agregar en una posicion determinada
    public void agregar_posicion(T elemento,posicion) {
        lista.add(posicion,elemento)
    }


}
