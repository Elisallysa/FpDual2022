public class Pedido {
	
	private int numPedido;
	private double importePedido;
	private int articulos;
	private String cliente;
	private String empleado;
	
	public Pedido (int order, double amount, int items, String client, String employee){
	numPedido = order;
	importePedido = amount;
	articulos = items;
	cliente = client;
	empleado = employee;
	}
	
	public void numPedido(){
	System.out.println("El número de pedido es: "+numPedido);
	}
	
	public void nombreCliente(){
	System.out.println("Nombre del Cliente: "+cliente);
	}
	
	public void nombreEmpleado() {
	System.out.println("Pedido gestionado por: "+empleado);
	}
	
	public void mediaPrecios() {
	System.out.println("La media de precio/artículo es: "+importePedido/articulos+" euros/artículo");
	}
	
	public void getCliente(){
	
	Cliente cliente1 = new Cliente(){
		
		private String nombre;
		private String apellidos;
		private double totalPagado;
		private double cashback;
		private int mesesAntiguedad;
		private char sexo;
		
		@Override
		public void setNombre(String name) {
		nombre = name;
		}
		
		@Override
		public void setApellidos(String lastname) {
		apellidos = lastname;
		}
		
		@Override
		public void setTotalPagado(double total) {
		totalPagado = total;
		}
		
		@Override
		public void setCashback(double cash) {
		cashback = cash;
		}
		
		@Override
		public void setMesesAntiguedad(int meses) {
		mesesAntiguedad = meses;
		}
		
		@Override
		public void setSexo(char sex) {
		sexo = sex;
		}
		
		@Override
		public void imprimirDatos() {
		System.out.println("Nombre: "+nombre+"\nApellidos: "+apellidos+"\nTotal gastado: "+totalPagado+"\nCashback: "+cashback+"\nMeses de suscripción: "+mesesAntiguedad+"\nSexo: "+sexo);
		}
	};
	
	
	cliente1.setNombre(cliente);
	cliente1.setApellidos("López Bueno");
	cliente1.setTotalPagado(450.6);
	cliente1.setCashback(4.3);
	cliente1.setMesesAntiguedad(9);
	cliente1.setSexo('M');
	cliente1.imprimirDatos();
	
	
}

public void getEmpleado(){
	
	Empleado empleado1 = new Empleado(){
		
	private String nombreCompleto;
	private double salarioBrutoMensual;
	private boolean contratoTemporal;
		
		@Override
		public void setNombreCompleto(String name) {
		nombreCompleto = name;
		}
		
		@Override
		public void setSalarioBrutoMensual(double salario) {
		salarioBrutoMensual = salario;
		}
		
		@Override
		public void setContratoTemporal(boolean temporal) {
		contratoTemporal = temporal;
		}
		
		@Override
		public void imprimirEmpleado(){
		System.out.println("Nombre completo: "+nombreCompleto+"\nSalario bruto mensual: "+salarioBrutoMensual+"\nContrato temporal: "+contratoTemporal);
		}
		
	};
	
	
	empleado1.setNombreCompleto(empleado);
	empleado1.setSalarioBrutoMensual(1490.6);
	empleado1.setContratoTemporal(false);
	empleado1.imprimirEmpleado();
	
	
}
	
public static void main(String[]args) {
	
	Pedido pedido1 = new Pedido(104, 43.8, 6, "Arturo", "Jorge Martínez Ruz");
	pedido1.numPedido();
	pedido1.nombreCliente();
	pedido1.nombreEmpleado();
	pedido1.mediaPrecios();
	
	System.out.println("\nDatos del cliente:");
	pedido1.getCliente();
	
	System.out.println("\nDatos del empleado:");
	pedido1.getEmpleado();
	}
	

}

abstract class Cliente{
abstract void setNombre(String name);
abstract void setApellidos(String lastname);
abstract void setTotalPagado(double total);
abstract void setCashback(double cash);
abstract void setMesesAntiguedad(int meses);
abstract void setSexo(char sex);
abstract void imprimirDatos();
}

abstract class Empleado{
abstract void setNombreCompleto(String name);
abstract void setSalarioBrutoMensual(double salario);
abstract void setContratoTemporal(boolean temporal);
abstract void imprimirEmpleado();
}