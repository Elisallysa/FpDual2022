abstract class AbstractProducto {

	protected date fechaCaducidad;
	protected int numLote;
	protected int uds;
	
	public AbstractProducto(date fechaCaducidad, int numLote) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
		this.uds = 0;
	}
	
	public void setUds(int unidades) {
		this.uds = unidades;
	}	
	
	public abstrac void printProducto();
}