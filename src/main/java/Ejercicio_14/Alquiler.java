package Ejercicio_14;

import java.time.LocalDate;

public class Alquiler extends PrendaSimple{

	private LocalDate comiezoContrato;
	private LocalDate finContrato;
	
	public Alquiler(LocalDate comiezoContrato,LocalDate finContrato, double costo)
	{
		super(costo);
		this.comiezoContrato=comiezoContrato;
		this.finContrato=finContrato;
	}
	
	@Override
	public double calcularValor() {
		return this.finContrato.compareTo(comiezoContrato)*getCosto();
	}

	@Override
	public double coheficienteDeLiquidez() {
		return 0.9;
	}

}
