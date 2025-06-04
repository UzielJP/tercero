package Primer_Parcial_2024;

public class Cliente 
{
	private String nombre;
	private double salario;
	
	public double getSalario()
	{
		return this.salario;
	}
	
	public boolean mayorAPorcentaje(double cuota,double porcentaje)
	{
		return salario*porcentaje>cuota;
	}
	
}
