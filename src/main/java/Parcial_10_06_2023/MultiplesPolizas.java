package Parcial_10_06_2023;

public class MultiplesPolizas extends Promocion
{

	@Override
	public void decuentoPromocion(Persona persona) 
	{
		if(persona.polizasMayorADos())
		{
			persona.aplicarDescuento(0.10);
		}
	}

}
