package Ejercicio_11;

public class Pantano implements Celda
{

	@Override
	public double proporcionAgua() 
	{
		return 0.7;
	}

	@Override
	public double proporcionTierra() 
	{
		return 0.3;
	}

	@Override
	public boolean conAgua() 
	{
		return false;
	}

	@Override
	public boolean conTierra() 
	{
		return false;
	}

	@Override
	public boolean conPantano() 
	{
		return true;
	}
	
	@Override
	public boolean comparar(Celda c) 
	{
		return c.conPantano();
	}

	@Override
	public boolean ConMixta(Imagen mixta) 
	{
		return false;
	}
	
}
