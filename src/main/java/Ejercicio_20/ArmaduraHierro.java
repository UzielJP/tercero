package Ejercicio_20;

public class ArmaduraHierro implements Armadura
{

	@Override
	public int contra(Arma arma) 
	{
		return arma.contraHierro();
	}

}
