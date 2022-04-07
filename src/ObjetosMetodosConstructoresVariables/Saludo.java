public class Saludo{

	private String coletilla;
	
	public Saludo (String input) {
	coletilla = input;
	}
	
	public void imprimirSaludo() {
	System.out.println("Hola, "+coletilla);
	}

public static void main(String[]args){

Saludo saludo1 = new Saludo(args[0]);

saludo1.imprimirSaludo();
}


}	
