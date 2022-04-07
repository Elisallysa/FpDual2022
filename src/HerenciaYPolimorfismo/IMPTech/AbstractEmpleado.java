abstract class AbstractEmpleado {
	
	public static int MIN_EDAD = 18;
	public static int MAX_EDAD = 45;
	
	protected String nombreCompleto;
	protected String cedula;
	protected int edad;
	protected boolean married;
	protected double salario;
	
	public AbstractEmpleado(String nombreCompleto, String cedula, int edad, boolean married, double salario) {
	this.nombreCompleto = nombreCompleto;
	this.cedula = cedula;
	this.edad = edad;
	this.married = married;
	this.salario = salario;
	}
	
	public AbstractEmpleado(){
	this.nombreCompleto = nombreCompleto;
	this.cedula = cedula;
	this.edad = edad;
    this.married = married;
    this.salario = salario;
	}
	
	public void printCategoria(){
	if (this.edad <= 21)
	System.out.println("Principiante");
	else if (this.edad >= 22 && this.edad<=35)
	System.out.println("Intermedio");
	else
	System.out.println("Senior");
	}
	
	public void aumentoSalario(double aumento) {
	this.salario = this.salario*aumento;
	}
	
	public abstract void printEmpleado();
	
	}