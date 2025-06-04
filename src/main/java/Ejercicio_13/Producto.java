package Ejercicio_13;

import java.util.List;
import java.util.stream.Collectors;

public class Producto {

	private List<Ingrediente> ingredientes;
	
	public Producto(List<Ingrediente> ingredientes)
	{
		this.ingredientes=ingredientes;
	}
	
	@Override
	public String toString()
	{
		return this. ingredientes.stream()
                .map(a->a.toString())
                .collect(Collectors.joining(", "));
	}
	
	public double precioFinal()
	{
		return this.ingredientes.stream().mapToDouble(a->a.getValor()).sum();
	}
	
}
