/* Ejercicio 8
 Write code to generate and catch an ArrayIndexOutOfBoundsException.
*/

public class Ejercicio8 {

	public static void main(String[] args) {

		String[] array = new String[3];
		
		
		try {
		array[0] = "hola";
		array[1] = "qué";
		array[2] = "tal";
		array[3] = "NOOORRR";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}