package Segunda_Fecha_2023;

public class SinIniciar extends EstadoTarea
{
	
	@Override
	public void iniciarTarea(Simple tarea)
	{
		tarea.setEstado(new Iniciado(tarea));
	}

}
