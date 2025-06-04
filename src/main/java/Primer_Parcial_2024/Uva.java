package Primer_Parcial_2024;

public class Uva extends Prestamo
{

	public Uva(Cliente cliente, int cuotas, double montoSolicitado) {
		super(cliente, cuotas, montoSolicitado);
	}

	@Override
	protected double getInteres() 
	{
		return Indec.getIndiceInflacion();
	}

	@Override
	protected double valorSellado() 
	{
		return 0.0;
	}

}
