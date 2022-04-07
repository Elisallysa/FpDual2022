/* Ejercicio 2
 Create your own exception class using the extends keyword. Write a constructor for this class
 that takes a String argument and stores it inside the object with a String reference. Write
 a method that prints out the stored String. Create a try-catch clause to exercise your new
 exception.
*/
import java.util.Scanner;

public class Ejercicio2 {

	private String cadena = new Scanner(System.in).next();

public static void main(String[] args) {

		System.out.println("Salúdame:");
		String cadena = new Scanner(System.in).next();

		try {
			
			if (cadena.equalsIgnoreCase("hola")) {
			System.out.println("Así me gusta.");
			} else {
				throw new IsNotHelloException("¿Pero por qué no me dices hola?");
			}
			
		} catch (Exception e) {
			System.out.println("Parece que ha habido un error");
			e.printStackTrace();
		}
		
	}

}

class IsNotHelloException extends Exception {

	public IsNotHelloException(String message) {
		super(message);
	}

}