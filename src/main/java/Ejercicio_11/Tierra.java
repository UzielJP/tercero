package Ejercicio_11;

public class Tierra implements Celda
{

	@Override
	public double proporcionAgua() 
	{
		return 0;
	}

	@Override
	public double proporcionTierra() 
	{
		return 1;
	}

	@Override
	public boolean conAgua() 
	{
		return false;
	}

	@Override
	public boolean conTierra() 
	{
		return true;
	}

	@Override
	public boolean conPantano() 
	{
		return false;
	}

	@Override
	public boolean comparar(Celda c) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean ConMixta(Imagen mixta) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
