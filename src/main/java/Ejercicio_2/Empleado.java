package Ejercicio_2;

public abstract class Empleado {

	public double sueldo()
	{
		return (this.basico()+this.adicional())-this.descuento();
	}

	public double descuento()
	{
		return this.basico()*0.13+this.adicional()*0.5;
	}

	public abstract double basico();
	public abstract double adicional();

}
