package Segunda_Fecha_2023;

import java.util.List;

public class Compleja extends Tarea
{
	
	private List<Tarea> tareas;

	@Override
	public double estimacionTotal() 
	{
		return this.tareas.stream().mapToDouble(a->a.estimacionTotal()).sum();
	}

	@Override
	public long tiempoUtilizado() 
	{
		return this.tareas.stream().mapToLong(a->a.tiempoUtilizado()).sum();
	}

	@Override
	public double avanceDeUnaTarea() 
	{
		return 0;
	}

	@Override
	public void iniciarTarea() 
	{
		this.tareas.stream().forEach(a->a.iniciarTarea());
	}

	@Override
	public void completarTarea() 
	{
		this.tareas.stream().forEach(a->a.completarTarea());	
	}
	
	

}
