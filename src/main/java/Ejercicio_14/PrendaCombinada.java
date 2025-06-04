package Ejercicio_14;

import java.util.LinkedList;
import java.util.List;

public class PrendaCombinada extends Prenda{

	private List<Prenda> prendas;
	
	public PrendaCombinada(Prenda prenda)
	{
		this.prendas= new LinkedList<Prenda>();
		this.prendas.add(prenda);
	}
	
	public void agregarPrenda(Prenda prenda)
	{
		this.prendas.add(prenda);
	}

	@Override
	public double calcularValor() 
	{
		return this.prendas.stream().mapToDouble(a->a.valorPrendario()).sum();
	}

	@Override
	public double coheficienteDeLiquidez() 
	{
		return 0.5;
	}
	
}
