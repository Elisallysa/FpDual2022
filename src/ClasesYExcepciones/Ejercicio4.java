/* Ejercicio 4
 Define an object reference and initialize it to null. Try to call a method through
 this reference. Now wrap the code in a try-catch clause to catch the exception.
*/

public class Ejercicio4 {

	private String titulo;
	private int numEjercicio;
	
	public Ejercicio4 (String titulo, int numEjercicio) {
	this.titulo = titulo;
	this.numEjercicio = numEjercicio;
	}
	
	public String getTitulo () {
	return titulo;
	}

public static void main(String[] args) {

		Ejercicio4 ej4 = null;

		try {
			System.out.println(ej4.getTitulo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}