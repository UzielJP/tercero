package Parcial_10_06_2023;

public class CampaniaExepcional extends Promocion
{
	@Override
	public void decuentoPromocion(Persona persona)
	{
		Vehiculo masEconomico = persona.seguroMasBarato();
		if(masEconomico!=null)
		{
			masEconomico.restarValorSeguro(0.50);
		}
	}
}
