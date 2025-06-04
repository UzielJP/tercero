package Ejercicio_14;

public abstract class PrendaSimple extends Prenda
{
	
	private double costo;
	
	public PrendaSimple(double costo)
	{
		this.costo=costo;
	}
	
	public double getCosto()
	{
		return this.costo;
	}
	
}
