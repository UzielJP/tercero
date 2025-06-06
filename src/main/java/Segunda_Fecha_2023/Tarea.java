package Segunda_Fecha_2023;

public abstract class Tarea 
{

	private String descripcion;
	
	public abstract double estimacionTotal();
	public abstract long tiempoUtilizado();
	public double avanceDeUnaTarea()
	{
		return this.tiempoUtilizado()/this.estimacionTotal();
	}
	public abstract void iniciarTarea();
	public abstract void completarTarea();

	
}
