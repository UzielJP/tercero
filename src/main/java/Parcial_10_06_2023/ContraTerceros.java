package Parcial_10_06_2023;

public class ContraTerceros extends Seguro
{

	@Override
	protected double montoCoberturaVida() {
		return 100;
	}

	@Override
	protected double multiplicaCobertura(double monto, Vehiculo vehiculo, Persona persona) 
	{
		return persona.multiplicarPoredad(monto);
	}

	@Override
	protected double montoCoberturaDeDanios() {
		return 1000;
	}

	@Override
	protected double calculoCoberturaDeDanios(double monto, Vehiculo vehiculo, Persona persona) {
		return vehiculo.multiplicarPorValor(monto);
	}

	@Override
	protected double calculoCoberturaDeDestruccion(Vehiculo vehiculo) {
		return 0;
	}


}
