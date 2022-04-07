package Arrays.Colecciones;

/* Ejercicio 2
 * EUC que contenga un método que reciba un arreglo tipo int y que retorne true
 * (verdadero) este no contiene un 2 o un 3 en sus valores, y falso (false) si
 * contiene un 2 o un 3 en sus valores.
 */

import java.util.ArrayList;

public class Ejercicio2 {
    public Boolean notContainsTwoOrThree(ArrayList<Integer> listaNumeros) {
        boolean twoOrTreeIn = false;
        for (Integer entero: listaNumeros) {
            if (entero == 2 || entero == 3) {
                twoOrTreeIn = true;
            }
        }
        return !twoOrTreeIn;
    }

    public static void main (String[]args){
        Ejercicio2 ej2 = new Ejercicio2();

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(1);
        lista.add(1);

        System.out.println(lista.toString()+": "+ej2.notContainsTwoOrThree(lista));

        ArrayList<Integer> listaConDos = new ArrayList<Integer>();
        listaConDos.add(1);
        listaConDos.add(2);
        listaConDos.add(1);

        System.out.println(listaConDos.toString()+": "+ej2.notContainsTwoOrThree(listaConDos));

        ArrayList<Integer> listaConTres = new ArrayList<Integer>();
        listaConTres.add(1);
        listaConTres.add(1);
        listaConTres.add(3);

        System.out.println(listaConTres.toString()+": "+ej2.notContainsTwoOrThree(listaConTres));

    }
}
