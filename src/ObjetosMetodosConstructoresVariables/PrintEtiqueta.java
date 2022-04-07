public class PrintEtiqueta {
	
	private String etiqueta;
	private String contenido;
	
	public PrintEtiqueta(String tag, String content) {
		etiqueta = tag;
		contenido = content;
	}
	
	public void buildTag() {
	System.out.println("<"+etiqueta+">"+contenido+"</"+etiqueta+">");
	}
	
public static void main(String[]args){

PrintEtiqueta impresora = new PrintEtiqueta(args[0], args[1]);

impresora.buildTag();
}
}