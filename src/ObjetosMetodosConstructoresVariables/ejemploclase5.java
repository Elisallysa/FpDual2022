public class FpDualClasesAnidadas{
 
private Vehiculo vehiculo;
 
public FpDualClasesAnidadas(int cantidad, String modelo, String superfi){
vehiculo = new Vehiculo(cantidad,modelo, superfi);
}
 
public Vehiculo getVehiculo(){
return vehiculo;
}
 
 
public static void main(String[]args){
 
Vehiculo coche = new FpDualClasesAnidadas(4, "V12", "Asfalto").getVehiculo();
coche.imprimirDatos();
}
 
class Vehiculo{
 
private int cantidadRuedas;
private String modeloMotor;
private String superficie;
 
public Vehiculo(int cantidad, String modelo, String superfi){
cantidadRuedas = cantidad;
modeloMotor = modelo;
superficie = superfi;
}
 
public void imprimirDatos(){
System.out.println("\nCantidad Ruedas: "+cantidadRuedas+"\nModelo Motor: "+modeloMotor+"\nSuperficie transito: "+superficie);
}
 
}
 
}
