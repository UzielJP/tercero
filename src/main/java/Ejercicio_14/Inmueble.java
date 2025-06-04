package Ejercicio_14;

import java.time.LocalDate;

public class Inmueble extends PrendaSimple{

	private String direccion;
	private double superficie;
	
	public Inmueble(String direccion,double superficie,double costo)
	{
		super(costo);
		this.direccion=direccion;
		this.superficie=superficie;
	}
	
	@Override
	public double calcularValor() {
		return this.superficie*getCosto();
	}

	@Override
	public double coheficienteDeLiquidez() {
		return 0.2;
	}

}
