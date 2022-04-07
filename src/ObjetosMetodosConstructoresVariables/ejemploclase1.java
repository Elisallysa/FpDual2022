public class FpDual{
 
private int anioImparte;
private int cantidadParticipantes;
 
public FpDual(){
anioImparte = 2022;
cantidadParticipantes = 23;
}
 
public FpDual(int anio, int cantidad){
anioImparte = anio;
cantidadParticipantes = cantidad;
}
 
public void imprimirDatos(){
System.out.println("Año en el que se imparte: "+anioImparte+"\nCantidad de participantes: "+cantidadParticipantes);
}
 
public static void main(String[]args){
FpDual fpDual = new FpDual();
fpDual.imprimirDatos();
 
FpDual fpDual2 = new FpDual(2023, 40);
fpDual2.imprimirDatos();
 
FpDual fpDual3 = new FpDual(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
fpDual3.imprimirDatos();
}
 
}
