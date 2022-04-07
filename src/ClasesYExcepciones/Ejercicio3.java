/* Ejercicio 3
 Write a class with a method that throws an exception of the type created in Exercise 2.
 Try compiling it without an exception specification to see what the compiler says. Add
 the appropriate exception specification. Try out your class and its exception inside a
 try-catch clause.
*/

import java.util.Scanner;

public class Ejercicio3 {

	private String cadena = new Scanner(System.in).next();

public static void main(String[] args) {

		System.out.println("What's Spanish for 'hello'?");
		String cadena = new Scanner(System.in).next();

		try {
			
			if (cadena.equalsIgnoreCase("hola")) {
			System.out.println("You're right.");
			} else {
				throw new IsNotHelloException("Nope, "+cadena+" is not Spanish for 'hello'");
			}
			
		} catch (Exception e) {
			System.out.println("Wroooong.");
			e.printStackTrace();
		}
		
	}

}