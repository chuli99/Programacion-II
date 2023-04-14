package Clases;

import java.util.ArrayList;
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
    //Metodo para agregar al principio
    public void agregar_principio(T elemento){
        lista.add(0,elemento);
    }
    //Metodo para ordenar lista
    //public void ordenar_lista() {
    //    Collections.sort(lista);
    //}

    //Metodo para desordenar la lista
    public void desordenar_lista(){
        Collections.shuffle(lista);
    }

    //Metodo para agregar en una posicion determinada
    public void agregar_posicion(T elemento, int posicion) {
        lista.add(posicion, elemento);
    }
    //Metodo para Obtener elemento en una posicion determinada
    public T obtener_posicion(int posicion){
        return lista.get(posicion);
    }

    //Metodo para obtener el primer elemento
    public T obtener_primer_elemento(){
        return lista.get(0);
    }

    //Metodo para obtener el ultimo elemento
    public T obtener_ultimo_elemento(){
        return lista.get(lista.size() - 1);
    }

    //Metodo que remueve objeto en una posicion en particular
    public void remover_objeto(int posicion) {
        lista.remove(posicion);
    }
    }
