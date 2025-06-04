package Ejercicio_18;

public class Tamanio extends BaseAspecto
{
	
	protected Tamanio(FileManager file) 
	{
		super(file);
	}

	@Override
	public String caracteristica() 
	{
		return this.getTamanio();
	}
	
}
