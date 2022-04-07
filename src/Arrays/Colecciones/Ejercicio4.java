package Arrays.Colecciones;

import java.util.Collections;
import java.util.LinkedList;

/*
EUC que contenga un método que reciba un arreglo tipo int y que retorne otro arreglo que contenga los mismos valores del
arreglo recibidos por parámetros pero invertidos.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println("Lista de números: "+lista);
        System.out.println("Lista invertida: "+invertida(lista));
    }

public static LinkedList<Integer> invertida(LinkedList<Integer> lista){
    Collections.reverse(lista);
    return lista;
}



}
