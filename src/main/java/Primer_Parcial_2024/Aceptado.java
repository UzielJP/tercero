package Primer_Parcial_2024;

public class Aceptado extends EstadoPrestamo
{
	
	@Override
	public double gastoDeCancelacion(Prestamo prestamo)
	{
		throw new Error("Error");
	}
	
	@Override
	public void pagarUnaCuotaDePrestamo(double monto,Prestamo prestamo)
	{
		prestamo.pagarCuota(monto);
		if(prestamo.finalizado())
		{
			prestamo.setEstado(new Finalizado());
		}
	}

}
