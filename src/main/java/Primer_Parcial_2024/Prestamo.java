package Primer_Parcial_2024;

public abstract class Prestamo 
{
	
	private double montoPagado;
	private double montoSolicitado;
	private int cuotas;
	private int cuotasPagadas;
	private Cliente cliente;
	private EstadoPrestamo estado;
	
	public Prestamo(Cliente cliente,int cuotas, double montoSolicitado)
	{
		this.cliente=cliente;
		this.montoSolicitado=montoSolicitado;
		this.cuotas=cuotas;
		this.cuotasPagadas=0;
		this.montoPagado=0;
		if(this.cliente.mayorAPorcentaje(0.30, this.valorDeCuota()))
		{
			this.setEstado(new Aceptado());
		}
		else
		{
			this.setEstado(new Rechazado());
		}
	}
	
	protected abstract double getInteres();
	
	public double valorDeCuota()
	{
		return (this.montoSolicitado+(this.montoSolicitado*this.getInteres()))/this.cuotas;
	}
	
	public double getMontoPagado()
	{
		return this.montoPagado;
	}
	
	public double getMontoRestante()
	{
		return this.valorDeCuota()*(this.cuotas-this.cuotasPagadas);
	}
	
	void setEstado(EstadoPrestamo estado)
	{
		this.estado=estado;
	}
	
	void pagarCuota(double monto)
	{
		this.montoPagado+=monto;
		this.cuotasPagadas++;
	}
	
	boolean finalizado()
	{
		return (this.cuotasPagadas==this.cuotas);
	}
	
	public double gastoAdministrativo()
	{
		return this.getMontoRestante()+this.getMontoRestante()*0.10+this.valorSellado();
	}
	
	protected abstract double valorSellado();
	
}
