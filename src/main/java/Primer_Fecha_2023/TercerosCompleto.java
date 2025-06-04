package Primer_Fecha_2023;

public class TercerosCompleto extends BuilderSeguro
{

	@Override
	protected double montoCoberturaVida() {
		return 5000;
	}

	@Override
	protected double multiplicaCobertura(double monto, Vehiculo vehiculo, Persona persona) {
		return vehiculo.multiplicarPorOcupantes(monto);
	}
	
	@Override
	protected double montoCoberturaDeDanios() {
		return 4000;
	}

	@Override
	protected double calculoCoberturaDeDanios(double monto, Vehiculo vehiculo, Persona persona) {
		
		if(vehiculo.masDeCiertosAnios(4))
		{
			return vehiculo.multiplicarPorAntiguedad(monto);
		}
		return 10000;
	}

	@Override
	protected double calculoCoberturaDeDestruccion(Vehiculo vehiculo) 
	{
		return 10000;
	}



}
