package Ejercicio_18;

public class Permisos extends BaseAspecto
{

	public Permisos(FileManager file) 
	{
		super(file);
	}

	@Override
	public String caracteristica() 
	{
		return this.getPermisos();
	}

}
