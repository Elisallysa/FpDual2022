public class FpDualClasesAnidadasAnonima{
 
private int cantidadRuedas;
private String modeloMotor;
private String superficie;
 
public FpDualClasesAnidadasAnonima(int cantidad, String modelo, String superfi){
cantidadRuedas = cantidad;
modeloMotor = modelo;
superficie = superfi;
}
 
public void getVehiculo(){
 
Vehiculo coche = new Vehiculo(){
 
private int cantidadRue;
private String modeloMot;
private String superfici;
 
@Override
public void setCantidadRue(int cantidad){
cantidadRue = cantidad;
}
 
@Override
public void setModeloMot(String modelo){
modeloMot = modelo;
}
 
@Override
public void setSuperfici(String sup){
superfici = sup;
}
 
@Override
public void imprimirDatos(){
System.out.println("\nCantidad Ruedas: "+cantidadRue+"\nModelo Motor: "+modeloMot+"\nSuperficie transito: "+superfici);
}
 
};
 
 
Vehiculo coche2 = new Vehiculo(){
@Override
public void setCantidadRue(int cantidad){
}
 
@Override
public void setModeloMot(String modelo){
}
 
@Override
public void setSuperfici(String sup){
}
@Override
public void imprimirDatos(){
System.out.println("No hago nada");
}
 
};
 
coche.setCantidadRue(cantidadRuedas);
coche.setModeloMot(modeloMotor);
coche.setSuperfici(superficie);
coche.imprimirDatos();
coche2.setCantidadRue(cantidadRuedas);
coche2.imprimirDatos();
 
}
 
public static void main(String[]args){
 
FpDualClasesAnidadasAnonima coche = new FpDualClasesAnidadasAnonima(4, "V12", "Asfalto");
coche.getVehiculo();
}
 
}
 
abstract class Vehiculo{
abstract void setCantidadRue(int cantidad);
abstract void setModeloMot(String modelo);
abstract void setSuperfici(String superficie);
abstract void imprimirDatos();
}
