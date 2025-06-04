package Ejercicio_20;

public class ArmaduraAcero implements Armadura
{

	@Override
	public int contra(Arma arma) 
	{
		return arma.contraAcero();
	}

}
