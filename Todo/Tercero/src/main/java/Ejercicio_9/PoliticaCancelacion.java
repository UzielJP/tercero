package Ejercicio_9;

public abstract class PoliticaCancelacion {

	public double reembolso(long d, double monto)
	{
		return monto*this.porcentajeAReembolsar(d);
	}
	
	protected abstract double porcentajeAReembolsar(long d);

}
