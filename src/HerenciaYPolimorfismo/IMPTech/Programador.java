public class Programador extends AbstractEmpleado {

	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Programador (String nombreCompleto, String cedula, int edad, boolean married, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombreCompleto, cedula, edad, married, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public Programador () {
		super(nombreCompleto, cedula, edad, married, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
}