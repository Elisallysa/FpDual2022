public class ParameterPrinter {
	
	private int parameters;
	
	public ParameterPrinter(int parametros) {
		parameters = parametros;
	}
	
	public void printParametro(String word) {
	System.out.print(word+" ");
	}
	
public static void main(String[]args){

int numParam = args.length;

ParameterPrinter impresora = new ParameterPrinter(numParam);

for (int i = 0; i < numParam; i++) {

String parametro = args[i];

impresora.printParametro(parametro);

}

}
}