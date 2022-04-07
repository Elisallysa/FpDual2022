public class Cliente {
	
	private String nombre;
	private String apellidos;
	private double totalPagado;
	private double cashback;
	private int mesesAntiguedad;
	private char sexo;
	
	public Cliente(String name, String surname, double amountSpent, double percentage, int months, char sex) {
	nombre = name;
	apellidos = surname;
	totalPagado = amountSpent;
	cashback = percentage;
	mesesAntiguedad = months;
	sexo = sex;
	}
	
	public Cliente() {
	nombre = name;
	apellidos = surname;
	totalPagado = amountSpent;
	cashback = percentage;
	mesesAntiguedad = months;
	sexo = sex;
	}
	
	public void imprimirDatos(){
	System.out.println("Nombre: "+nombre+"\nApellidos:"+apellidos+"\nSexo: "+sexo+"\nHistorial de gasto en tienda: "+totalPagado+"  €"+"\nMeses de suscripción: "+mesesAntiguedad);
}
	
	public double cashbackAcumulado() {
	return totalPagado*cashback;
	}

	public String nombreCompleto(){
	String fullName = nombre+" "+apellidos;
	return fullName;
	}
	
	public double gastoMensual() {
	return totalPagado/mesesAntiguedad;
	}
	
	public void antiguedad() {
	System.out.println("La antiguedad de este cliente es de "+mesesAntiguedad+ " meses.");
	}
	
	public void clientePremium() {
		if (mesesAntiguedad>5 && totalPagado/12>20) {
			System.out.println("¡"+nombre+" es un cliente premium!");
	} else {
	System.out.println("No es un cliente premium");
	}
	}
	
	

public static void main(String[]args){
	Cliente cliente1 = new Cliente("Rigoberta", "Ramírez Luque", 321.5, 0.01, 6, 'F');
cliente1.imprimirDatos();
System.out.println("El cashback acumulado de este cliente es de: "+cliente1.cashbackAcumulado()+"  €");
System.out.println("Su nombre completo es: "+cliente1.nombreCompleto());
System.out.println("Su gasto mensual es de: "+cliente1.gastoMensual()+"  €");
cliente1.antiguedad();
cliente1.clientePremium();
}

}

