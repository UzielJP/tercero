package Ejercicio_20;

public class ArmaduraCuero implements Armadura
{

	@Override
	public int contra(Arma arma) 
	{
		return arma.contraCuero();
	}

}
