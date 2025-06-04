package Ejercicio_16;

import java.time.LocalDate;

public class BuilderIntermedio extends BuilderPC
{

	public BuilderIntermedio(LocalDate fecha, String nombre) 
	{
		super(fecha, nombre);
	}

	@Override
	public void agregarProcesador() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("Procesador Intermedio "));
	}

	@Override
	public void agregarRam() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("16 GB"));
	}

	@Override
	public void agregarGrafica() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("GTX 1650"));
	}
	
	@Override
	public void agregarDisco() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("SSD 500 GB"));
	}

	@Override
	public void agregarGabinete() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("Gabinete Intermedio"));
		presupuesto.agregarComponente(catalogo.getComponente("Fuente 800 w"));
	}

}
