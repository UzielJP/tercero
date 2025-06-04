package Ejercicio_9;

public class Moderada extends PoliticaCancelacion{

	protected double porcentajeAReembolsar(long d)
	{
		if(d>=7)
		{
			return 1;
		}
		else
		{
			if(d>=2)
			{
				return 0.50;
			}
		}
		return 0;
	}
	
}
