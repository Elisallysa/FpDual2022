/* Ejercicio 1
 Create a class with a main( ) that throws an object of class Exception inside
 a try block. Give the constructor for Exception a String argument. Catch the exception
 inside a catch clause and print the String argument. Add a finally clause and print a
 message to prove you were there.
*/
import java.util.Scanner;


public class Ejercicio1 {

public static void main(String[] args) {

		System.out.println("Introduce una letra");
		String cadena = new Scanner(System.in).next();

		try {
			int parseado = Integer.parseInt(cadena);
			System.out.println(parseado);
		} catch (Exception e) {
			System.out.println("Parece que ha habido un error");
			e.printStackTrace();
		} finally {
			System.out.println("------> Esto esta dentro de finally");
		}
		
	}

}