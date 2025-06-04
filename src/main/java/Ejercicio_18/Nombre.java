package Ejercicio_18;

public class Nombre extends BaseAspecto
{

	public Nombre(FileManager file) 
	{
		super(file);
	}

	@Override
	public String caracteristica()
	{
		return this.getNombre();
	}
	
}
