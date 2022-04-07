/* Ejercicio 9
 Create your own resumption-like behavior by using a while
 loop that repeats until an exception is no longer thrown.
*/
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numero = 0; 
		
		try {
		
		do {
		
			System.out.println("Introduce un número mayor que 5:");
			numero = Integer.parseInt(s.nextLine());
			
		} while (isLessThanFive(numero));			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin del ejercicio"+numero);
		
	}	


private static Boolean isLessThanFive(int number) {
	try {
		
	if (number<5) {
		throw new LessThanFiveException("El número es menor que 5");
	} else {
		return false;
	}
	} catch (LessThanFiveException e) {
	e.printStackTrace();
	}
	return true;

}
}
class LessThanFiveException extends Throwable {

	private final static String MESSAGE = "Excepción personal";
	
	public LessThanFiveException(String message) {
		super(MESSAGE +": "+message);
	}

}
