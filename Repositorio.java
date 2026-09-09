package ar.edu.lab.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Repositorio<T> {
    public List<T> lista = new ArrayList<>();

    public void agregar( T elemento ){
        lista.add(elemento);
    }

    public List<T> obtenerTodos(){
        return List.copyOf(lista);
    }

    public void quitar(T elemento){
        lista.remove(elemento);
    }

    public int size(){
        return lista.size();
    }

    public Stream<T> stream(){
        return lista.stream();
    }


    public List<T> filtrarPorCriterio(Predicate<T> criterio){

        List<T> resultado= new ArrayList<>();

        for(T e: lista){
            if(criterio.test(e)){
                resultado.add(e);
            }
        }
        return resultado;
    }
}
