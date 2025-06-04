package Ejercicio_18;

public class FechaCreacion extends BaseAspecto
{

	protected FechaCreacion(FileManager file) 
	{
		super(file);
	}

	@Override
	public String caracteristica()
	{
		return this.getFechaCreacion();
	}

}
