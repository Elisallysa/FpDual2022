package Arrays.Colecciones;

/* Ejercicio 2
 * EUC que contenga un método que reciba un arreglo tipo int y que retorne otro
 * arreglo de enteros que contenga los 2 valores centrales del mismo. Ojo: debe
 * validar que solo pueda trabajar con arreglos de longitud par.
 */
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> lista = new ArrayList<Integer>();
            lista.add(1);
            lista.add(1);
            lista.add(2);
            lista.add(1);

            System.out.println("Lista 1: "+lista);
            System.out.println("Valores centrales de la lista 1: "+getValoresCentrales(lista));

            ArrayList<Integer> listaNula = null;
            System.out.println("Valores centrales de una lista nula: "+getValoresCentrales(listaNula));

            ArrayList<Integer> lista2 = new ArrayList<Integer>();
            lista2.add(4);
            lista2.add(1);
            lista2.add(7);

            System.out.println("Lista con valores impares: "+lista2);
            System.out.println("Valores centrales de la lista impar: "+getValoresCentrales(lista2));

        } catch (NotEvenArrayException neae) {
            neae.printStackTrace();
        }
    }

    static ArrayList<Integer> getValoresCentrales(ArrayList<Integer> listaNumeros) throws NotEvenArrayException {
        ArrayList<Integer> centrales = new ArrayList<Integer>();
        try {
            if (listaNumeros!=null && listaNumeros.size()%2==0){
                centrales.add(listaNumeros.get((listaNumeros.size()/2)-1));
                centrales.add(listaNumeros.get((listaNumeros.size()/2)));
            } else {
                throw new NotEvenArrayException("Este ArrayList no contiene un número de valores par.");
            }
        } catch (NullPointerException | NotEvenArrayException e) {
            e.printStackTrace();
        }
        return centrales;
    }

}

class NotEvenArrayException extends Exception {

    public NotEvenArrayException(String message) {
        super(message);
    }
}
