public class FpDual{
 
private int anioImparte;
private int cantidadParticipantes;
private static String titulo = "\nFp Dual 2022 =D";
 
public FpDual(){
anioImparte = 2022;
cantidadParticipantes = 23;
}
 
public FpDual(int anio, int cantidad){
anioImparte = anio;
cantidadParticipantes = cantidad;
titulo = "\nFp Dual "+anio+" =D";
}
 
public void imprimirDatos(){
System.out.println(titulo+"\n\nAño en el que se imparte: "+anioImparte+"\nCantidad de participantes: "+cantidadParticipantes);
}
 
public void imprimirDatos(String titulo1, String titulo2){
System.out.println(titulo+"\n"+titulo1+anioImparte+"\n"+titulo2+cantidadParticipantes);
}
 
public static void inicio(){
System.out.println(titulo);
}
 
public static void main(String[]args){
FpDual.inicio();
 
FpDual fpDual = new FpDual();
fpDual.imprimirDatos();
 
FpDual fpDual2 = new FpDual(2023, 40);
fpDual2.imprimirDatos();
 
FpDual fpDual3 = new FpDual();
fpDual3.imprimirDatos();
 
FpDual fpDual4 = new FpDual(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
fpDual4.imprimirDatos("Año: ", "Participantes: ");
}
 
}
