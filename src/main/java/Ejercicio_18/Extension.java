package Ejercicio_18;

public class Extension extends BaseAspecto
{

	protected Extension(FileManager file) 
	{
		super(file);
	}

	@Override
	public String caracteristica() 
	{
		return this.getExtension();
	}

}
