package logica;

public abstract class TMB {
	
	private int pesoKg;
	private int alturaCm;
	private int edadAños;
		
	protected abstract double calcularTMB(int pesoKg, int alturaCm,  int edadAños);

	public int getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}

	public int getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}

	public int getEdadAños() {
		return edadAños;
	}

	public void setEdadAños(int edadAños) {
		this.edadAños = edadAños;
	}
	
		
}

