package Primer_Fecha_2023;

public class Vehiculo 
{
	
	private Seguro seguro;
	private int antiguedad;
	private int maximoOcupantes;
	private double valorVehiculo;
	
	public Vehiculo(int antiguedad, int maximoOcupantes, double valorVehiculo) {
		this.antiguedad = antiguedad;
		this.valorVehiculo= valorVehiculo;
		this.maximoOcupantes = maximoOcupantes;
	}
	
	public Vehiculo(Seguro seguro, int antiguedad, int maximoOcupantes, double valorVehiculo) {
		this.seguro = seguro;
		this.antiguedad = antiguedad;
		this.valorVehiculo= valorVehiculo;
		this.maximoOcupantes = maximoOcupantes;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public int getMaximoOcupantes() {
		return maximoOcupantes;
	}
	
	public boolean masDeCiertosAnios(double anios)
	{
		return this.antiguedad>anios;
	}
	
	public double multiplicarPorAntiguedad(double monto)
	{
		return this.antiguedad*monto;
	}
	
	public double multiplicarPorOcupantes(double monto)
	{
		return this.maximoOcupantes*monto;
	}
	
	public double multiplicarPorValor(double monto)
	{
		return this.valorVehiculo*monto;
	}
	
	public double valorSeguro()
	{
		return this.seguro.valorSeguro();
	}
	
	public void restarValorSeguro(double decuento)
	{
		this.seguro.restarDescuento(decuento);
	}
	
	
	
	public int contarPoliza()
	{
		if(this.seguro!=null)
		{
			return 1;
		}
		return 0;
	}
	
}
