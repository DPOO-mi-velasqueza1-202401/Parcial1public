package logica;

public class Hombre extends TMB {

	public Hombre() {
	}
	
	@Override
	protected double calcularTMB(int pesoKg, int alturaCm, int edadAños) {
		// TODO Auto-generated method stub
		double calculo;
		calculo = 88.362 +(13.397 * pesoKg) + (4.799 * alturaCm) - (5.677*edadAños);
		return calculo;
	}

}
