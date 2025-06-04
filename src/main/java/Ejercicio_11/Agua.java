package Ejercicio_11;

public class Agua implements Celda
{
	@Override
	public double proporcionAgua() 
	{
		return 1;
	}

	@Override
	public double proporcionTierra() 
	{
		return 0;
	}
	
	@Override
	public boolean conAgua() 
	{
		return true;
	}

	@Override
	public boolean conTierra() 
	{
		return false;
	}

	@Override
	public boolean conPantano() 
	{
		return false;
	}

	@Override
	public boolean comparar(Celda c) 
	{
		return c.conAgua();
	}

	@Override
	public boolean ConMixta(Imagen mixta) 
	{
		return false;
	}
}