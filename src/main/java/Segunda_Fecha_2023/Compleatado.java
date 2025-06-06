package Segunda_Fecha_2023;

public class Compleatado extends EstadoTarea
{

	public Compleatado(Simple tarea) 
	{
		tarea.marcarFin();
	}
	
	@Override
	public long tiempoUtilizado(Simple tarea)
	{
		return tarea.tareaCompletada();
	}
	
	@Override
	public void iniciarTarea(Simple tarea){}
	
}
