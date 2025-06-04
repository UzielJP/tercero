package Ejercicio_14;

public abstract class Prenda {
	
	public double valorPrendario()
	{
		return this.calcularValor()*this.coheficienteDeLiquidez();
	}
	
	public abstract double calcularValor();
	public abstract double coheficienteDeLiquidez();
	
}
