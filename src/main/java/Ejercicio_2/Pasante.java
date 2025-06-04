package Ejercicio_2;

public class Pasante extends Empleado{

	private int examen;
	
	public double adicional()
	{
		return this.examen*2000;
	}
	
	public double basico()
	{
		return 20000;
	}
	
}
