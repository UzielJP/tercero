package Ejercicio_2;

public class Planta extends Empleado{
	
	private int antiguedad;
	
	public double adicional()
	{
		return this.antiguedad*2000;
	}
	
	public double basico()
	{
		return 50000;
	}
	
}
