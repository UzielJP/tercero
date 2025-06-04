package Ejercicio_16;

import java.time.LocalDate;

public class BuilderBasico extends BuilderPC
{

	public BuilderBasico(LocalDate fecha, String nombre) 
	{
		super(fecha, nombre);
	}

	@Override
	public void agregarProcesador() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("Procesador Básico"));
	}

	@Override
	public void agregarRam() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("8 GB"));
	}

	@Override
	public void agregarGrafica() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("8 GB"));
	}
	
	@Override
	public void agregarDisco() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("integrada"));
	}

	@Override
	public void agregarGabinete() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("Gabinete Estándar"));
	}

}
