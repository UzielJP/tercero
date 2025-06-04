package Primer_Fecha_2023;

public abstract class BuilderSeguro 
{
	
	private Seguro seguro;
	
	public void reset()
	{
		this.seguro= new Seguro();
	}
	
	public Seguro resultado()
	{
		return this.seguro;
	}
	
	public void asignarCoberturaDeVida(Vehiculo vehiculo, Persona persona)
	{
		this.seguro.setSeguroDeVida(this.multiplicaCobertura(this.montoCoberturaVida(),vehiculo,persona));
	}
	
	protected abstract double montoCoberturaVida();
	protected abstract double multiplicaCobertura(double monto,Vehiculo vehiculo, Persona persona);
	
	public void asignarCoberturaDeDanios(Vehiculo vehiculo, Persona persona)
	{
		this.seguro.setCoberturaDeDanios(this.calculoCoberturaDeDanios(this.montoCoberturaDeDanios(),vehiculo,persona));
	}
	
	protected abstract double montoCoberturaDeDanios();
	protected abstract double calculoCoberturaDeDanios(double monto,Vehiculo vehiculo, Persona persona);
	
	public void asignarCoberturaDeDestruccion(Vehiculo vehiculo)
	{
		this.seguro.setCoberturaDeDestruccion(vehiculo.multiplicarPorValor(0.5)+this.calculoCoberturaDeDestruccion(vehiculo));
	}
	
	protected abstract double calculoCoberturaDeDestruccion(Vehiculo vehiculo);
	
}
