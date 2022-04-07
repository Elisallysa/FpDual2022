public class Empleado {

private String nombreCompleto;
private double salarioBrutoMensual;
private boolean contratoTemporal;

public Empleado (String name, double salary, boolean temporary) {
nombreCompleto = name;
salarioBrutoMensual = salary;
contratoTemporal = temporary;
}

public String getNombre(){
return nombreCompleto;}

public double salarioAnual() {
return salarioBrutoMensual*14;
}

public void incrementoIndefinido() {
if (!contratoTemporal) {
salarioBrutoMensual = salarioBrutoMensual*1.1;
System.out.println("Ahora el salario bruto mensual es de: "+salarioBrutoMensual);
}else{
System.out.println("Este empleado no tiene plus por indefinido");
}
}

public double salarioNeto(double impuestos) {
return salarioBrutoMensual-impuestos;
}

public static void main(String[]args){
Empleado empleado1 = new Empleado ("Juan Baena Huertas", 1300.8, false);
System.out.println("El salario anual de "+empleado1.getNombre()+" es: "+empleado1.salarioAnual());
empleado1.incrementoIndefinido();
System.out.println("El salario neto de "+empleado1.getNombre()+" es: "+empleado1.salarioNeto(250.2));
}

}