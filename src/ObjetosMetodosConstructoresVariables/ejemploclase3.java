public class FpDualClasesAnidadasLocal{
 
private int cantidadRuedas;
private String modeloMotor;
private String superficie;
 
public FpDualClasesAnidadasLocal(int cantidad, String modelo, String superfi){
cantidadRuedas = cantidad;
modeloMotor = modelo;
superficie = superfi;
}
 
public void getVehiculo(){
 
class Vehiculo{
 
private int cantidadRue;
private String modeloMot;
private String superfici;
 
public Vehiculo(int cantidad, String modelo, String superfi){
cantidadRue = cantidad;
modeloMot = modelo;
superfici = superfi;
}
 
public void imprimirDatos(){
System.out.println("\nCantidad Ruedas: "+cantidadRue+"\nModelo Motor: "+modeloMot+"\nSuperficie transito: "+superfici);
}
 
}
 
Vehiculo coche = new Vehiculo(cantidadRuedas, modeloMotor, superficie);
coche.imprimirDatos();
 
}
 
public static void main(String[]args){
 
FpDualClasesAnidadasLocal coche = new FpDualClasesAnidadasLocal(4, "V12", "Asfalto");
coche.getVehiculo();
}
 
}
