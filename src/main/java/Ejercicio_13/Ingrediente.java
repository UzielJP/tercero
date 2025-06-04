package Ejercicio_13;

public class Ingrediente {

	private String nombre;
	private double valor;
	
	public Ingrediente(String nombre, double valor)
	{
		this.nombre=nombre;
		this.valor=valor;
	}
	
	@Override
	public String toString()
	{
		return this.nombre+" ("+this.valor+" pesos)";
	}
	
	public double getValor()
	{
		return this.valor;
	}
	
}
