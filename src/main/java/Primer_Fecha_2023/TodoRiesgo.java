package Primer_Fecha_2023;

public class TodoRiesgo extends BuilderSeguro
{

	@Override
	protected double montoCoberturaVida() {
		return 9000;
	}

	@Override
	protected double multiplicaCobertura(double monto, Vehiculo vehiculo, Persona persona) {
		return vehiculo.multiplicarPorAntiguedad(monto);
	}

	@Override
	protected double montoCoberturaDeDanios() {
		return 100000;
	}

	@Override
	protected double calculoCoberturaDeDanios(double monto, Vehiculo vehiculo, Persona persona) 
	{
		return persona.dividirPoredad(monto);
	}

	@Override
	protected double calculoCoberturaDeDestruccion(Vehiculo vehiculo) {
		return vehiculo.multiplicarPorAntiguedad(1000);
	}

}
