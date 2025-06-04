package Ejercicio_16;

import java.time.LocalDate;

public abstract class BuilderPC 
{

	protected Presupuesto presupuesto;
	protected Catalogo catalogo;
	
	protected BuilderPC(LocalDate fecha,String nombre)
	{
		this.presupuesto= new Presupuesto(fecha,nombre);
	}
	
	public void reset(LocalDate fecha,String nombre)
	{
		this.presupuesto= new Presupuesto(fecha,nombre);
	}
	
	public Presupuesto getResultado()
	{
		return this.presupuesto;
	}
	
	public abstract void agregarProcesador();
	public abstract void agregarRam();
	public abstract void agregarGrafica();
	public abstract void agregarDisco();
	public abstract void agregarGabinete();
	
}
