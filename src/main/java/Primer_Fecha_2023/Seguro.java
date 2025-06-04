package Primer_Fecha_2023;

public class Seguro 
{

	private double seguroDeVida;
	private double coberturaDeDanios;
	private double coberturaDeDestruccion;
	private double descuento;
	
	public Seguro()
	{
		this.descuento=0;
	}
	
	public void setSeguroDeVida(double monto)
	{
		this.seguroDeVida=monto;
	}
	
	public void setCoberturaDeDanios(double monto)
	{
		this.coberturaDeDanios=monto;
	}
	
	public void setCoberturaDeDestruccion(double monto)
	{
		this.coberturaDeDestruccion=monto;
	}
	
	public double valorSeguro()
	{
		return this.seguroDeVida+this.coberturaDeDanios+this.coberturaDeDestruccion-this.descuento;
	}
	
	public void restarDescuento(double decuento)
	{
		this.descuento=this.descuento-(this.descuento*descuento);
	}
	
	public void setDescuento(double monto)
	{
		this.descuento=monto;
	}
}
