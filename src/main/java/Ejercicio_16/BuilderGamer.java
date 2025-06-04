package Ejercicio_16;

import java.time.LocalDate;

public class BuilderGamer extends BuilderPC
{

	public BuilderGamer(LocalDate fecha, String nombre) 
	{
		super(fecha, nombre);
	}

	@Override
	public void agregarProcesador() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("Procesador Gamer."));
		presupuesto.agregarComponente(catalogo.getComponente("pad térmico"));
		presupuesto.agregarComponente(catalogo.getComponente("cooler"));
	}
	

	@Override
	public void agregarRam() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("32 gb "));
		presupuesto.agregarComponente(catalogo.getComponente("32 gb "));
	}

	@Override
	public void agregarGrafica() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("RTX 4090"));
	}
	
	@Override
	public void agregarDisco() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("SSD 500gb"));
		presupuesto.agregarComponente(catalogo.getComponente("SSD 1 TB"));
	}

	@Override
	public void agregarGabinete() 
	{
		presupuesto.agregarComponente(catalogo.getComponente("Gabinete Gamer"));
		presupuesto.agregarComponente(catalogo.getComponente("Fuente "+presupuesto.calcularConsumo()+" w"));
	}

}
