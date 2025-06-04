package Ejercicio_18;

public class FechaModificacion extends BaseAspecto
{

	protected FechaModificacion(FileManager file)
	{
		super(file);
	}

	@Override
	public String caracteristica()
	{
		return this.getFechaModificacion();
	}

}
