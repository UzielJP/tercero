package Ejercicio_13;

import java.util.LinkedList;
import java.util.List;

public abstract class SangucheBuilder {

	protected List<Ingrediente> ingredientes;
	
	public SangucheBuilder()
	{
		this.ingredientes= new LinkedList<Ingrediente>();
	}
	
	public Producto getResultado()
	{
		return new Producto(this.ingredientes);
	}
	
	public void reset()
	{
		this.ingredientes= new LinkedList<Ingrediente>();
	}
	
	public abstract void construirPan();
	public abstract void construirAdereso();
	public abstract void construirPrincipal();
	public abstract void construirAdicional();
	
}
