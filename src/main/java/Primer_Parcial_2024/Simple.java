package Primer_Parcial_2024;

public class Simple extends Prestamo
{
	private double interes;

	public Simple(Cliente cliente, int cuotas, double montoSolicitado, double interes) {
		super(cliente, cuotas, montoSolicitado);
		this.interes = interes;
	}

	@Override
	protected double getInteres() 
	{
		return this.interes;
	}

	@Override
	protected double valorSellado() 
	{
		return 5000;
	}
	

}
