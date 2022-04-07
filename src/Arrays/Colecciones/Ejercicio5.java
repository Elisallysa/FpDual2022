package Arrays.Colecciones;

/*
EUC que contenga un método que reciba un arreglo tipo String y que retorne otro arreglo que contenga las cadenas que
contengan números.
 */

import java.util.ArrayList;

public class Ejercicio5 {

    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList<String>();
        cadena.add("Hola");
        cadena.add("%%");
        cadena.add("3");
        cadena.add("345");
        cadena.add("a");

        System.out.println("Cadena: "+cadena.toString());
        System.out.println("Los números de la cadena: "+ getDigits(cadena));

    }

    public static ArrayList<Integer> getDigits(ArrayList<String> array) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (String elem: array){
            if (Character.isDigit(Integer.parseInt(String.valueOf(elem.charAt(0))))) {
                numeros.add(Integer.parseInt(elem));
            }
        }
        return numeros;
    }

}
