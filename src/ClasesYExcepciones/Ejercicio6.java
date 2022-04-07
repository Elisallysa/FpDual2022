/* Ejercicio 6
 Repeat the previous exercise, but inside the catch clause, wrap g( )’s
 exception in a RuntimeException.
*/
import java.util.Scanner;

public class Ejercicio6 {

	private int num1;
	private int num2;
	
	public Ejercicio6 (int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
	}

private static int sumaPares(int numero1, int numero2) throws IsNotEvenException {

if (numero1%2==0 && numero2%2==0) {
return numero1+numero2;
} else {
throw new IsNotEvenException("Los dos números tienen que ser pares.");
}
}

private static void muestraResultado(int num1, int num2) throws SoHardException {
try {

if (num1<100 && num2<100) {
System.out.println(sumaPares(num1, num2));
}else{
throw new SoHardException ("Uff, qué difisi.");
}

} catch (IsNotEvenException | RuntimeException | SoHardException e) {
e.printStackTrace();
}

}



public static void main(String[] args) {

		
	Scanner s = new Scanner(System.in);
	int num1 = Integer.valueOf(s.nextLine());
	int num2 = Integer.valueOf(s.nextLine());

	System.out.println("Sumador de números pares");

		try {
			
			muestraResultado(num1, num2);
			
			
		} catch (SoHardException e) {
			System.out.println("Parece que ha habido un error");
			e.printStackTrace();
		}

}

}

class IsNotEvenException extends Exception {

	public IsNotEvenException(String message) {
		super(message);
	}

}

class SoHardException extends Exception {

	public SoHardException(String message) {
		super(message);
	}

}