package Segunda_Fecha_2023;

public class Iniciado extends EstadoTarea
{

	public Iniciado(Simple tarea) 
	{
		tarea.marcarInicio();
	}
	
	@Override
	public void completarTarea(Simple tarea)
	{
		tarea.setEstado(new Compleatado(tarea));
	}

}
