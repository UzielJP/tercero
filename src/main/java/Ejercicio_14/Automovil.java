package Ejercicio_14;

import java.time.LocalDate;

public class Automovil extends PrendaSimple{

	private LocalDate modelo;
	private double kilometraje;
	
	public Automovil(LocalDate modelo, double kilometraje, double costo)
	{
		super(costo);
		this.modelo= modelo;
		this.kilometraje= kilometraje;
	}
	
	@Override
	public double calcularValor() {
		return getCosto()*(this.modelo.compareTo(LocalDate.now())/100);
	}

	@Override
	public double coheficienteDeLiquidez() {
		return 0.7;
	}

}
