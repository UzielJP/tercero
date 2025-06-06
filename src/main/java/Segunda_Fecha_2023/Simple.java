package Segunda_Fecha_2023;

import java.time.LocalDate;

public class Simple extends Tarea
{

	private int duracionEstimada;
	private EstadoTarea estadoTarea;
	private long fechaInicio;
	private long fechaFin;
	
	public Simple(int duracionEstimada) {
		super();
		this.duracionEstimada = duracionEstimada;
	}

	@Override
	public double estimacionTotal() 
	{
		return this.duracionEstimada;
	}

	@Override
	public long tiempoUtilizado() 
	{
		return this.estadoTarea.tiempoUtilizado(this);
	}
	
	@Override
	public void iniciarTarea()
	{
		this.estadoTarea.iniciarTarea(this);;
	}
	
	@Override
	public void completarTarea()
	{
		this.estadoTarea.completarTarea(this);
	}
	
	void setEstado(EstadoTarea estado)
	{
		this.estadoTarea= estado;
	}
	
	public void marcarInicio()
	{
		this.fechaInicio= System.out.currentTimeMillis();
	}
	
	public void marcarFin()
	{
		this.fechaFin= System.out.currentTimeMillis();
	}
	
	long tareaCompletada()
	{
		return this.fechaFin-this.fechaInicio;
	}

}
