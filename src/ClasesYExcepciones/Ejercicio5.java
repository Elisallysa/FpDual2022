/* Ejercicio 5
 Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type
 that you define. In f( ), call g( ), catch its exception and, in the catch clause, throw a
 different exception (of a second type that you define). Test your code in main( ).
*/
import java.util.Scanner;

public class Ejercicio5 {

	private int num1;
	private int num2;
	
	public Ejercicio5 (int num1, int num2) {
	this.num1 = num1;
	this.num2 = num2;
	}
	
public static void main(String[] args) throws AnotherException {

		
	Scanner s = new Scanner(System.in);
	int num1 = Integer.valueOf(s.nextLine());
	int num2 = Integer.valueOf(s.nextLine());

	System.out.println("Sumador de números pares");

	Ejercicio5 ejer5 = new Ejercicio5(num1, num2);
	
	ejer5.muestraResultado();

}	
	
	
public void muestraResultado() throws AnotherException {
try {

System.out.println(sumaPares());

} catch (Exception e) {
e.printStackTrace();
throw new AnotherException("Otra excepción");
}
}

public int sumaPares() throws IsNotEvenException {

if (this.num1%2==0 && this.num2%2==0) {
return this.num1+this.num2;
} else {
throw new IsNotEvenException("Los dos números tienen que ser pares.");
}
}

}




class IsNotEvenException extends Exception {

	public IsNotEvenException(String message) {
		super(message);
	}

}

class AnotherException extends Exception {

	public AnotherException(String message) {
		super(message);
	}

}