public class WordPrinter {
	private String word;
	private int num;
	
	public WordPrinter(String palabra, int numero) {
		word = palabra;
		num = numero;
	}
	
	public void printWord() {
	for (int i = 0; i<num; i++) {
	System.out.print(word+"\t");
	}
	}
	
public static void main(String[]args){

WordPrinter impresora = new WordPrinter(args[0], Integer.parseInt(args[1]));

impresora.printWord();
}
}