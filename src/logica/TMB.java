package logica;

public abstract class TMB {
	
	protected int pesoKg;
	protected int alturaCm;
	protected int edadAños;
		
	protected abstract double calcularTMB(int pesoKg, int alturaCm,  int edadAños);
	
		
}

