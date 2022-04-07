public class Envio {

	private int id;
	private String medio;
	private Fresco[] frescos;
	private Refrigerado[] refrigerados;
	private AirFrozen[] congeladosAire;
	private WaterFrozen[] congeladosAgua;
	private NitrogenFrozen[] congeladosNitrogeno;
	
	public (int id, String medio, Fresco[] frescos, Refrigerados[] refrigerados, AirFrozen[] congeladosAire, WaterFrozen[] congeladosAgua, NitrogenFrozen[] congeladosNitrogeno) {
		this.id = id;
		this.medio = medio;
		this.frescos = new Fresco[10];
		this.refrigerados = new Refrigerado[10];
		this.congeladosAire = new AirFrozen[10];
		this.congeladosAgua = new WaterFrozen[10];
		this.congeladosNitrogeno = new NitrogenFrozen[10];
	}	

	@Override
	public String toString() {
		return "Envío [id= "+id+", medio de transporte= "+medio+", productos frescos = "+frescos+", productos refrigerados= "+refrigerados+", productos congelados con aire= "+congeladosAire+", productos congelados con agua= "+congeladosAgua+", productos congelados con nitrógeno= "+congeladosNitrogeno+"]";
	}
	
}