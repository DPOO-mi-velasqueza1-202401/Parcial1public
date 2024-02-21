package logica;

public class Mujer extends TMB{

	public Mujer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected double calcularTMB(int pesoKg, int alturaCm, int edadAños) {
		// TODO Auto-generated method stub
		double calculo;
		calculo = 447.593 + (9.247 * pesoKg) + (3.098 * alturaCm) - (4.33 * edadAños);
		return calculo;
	}

}
