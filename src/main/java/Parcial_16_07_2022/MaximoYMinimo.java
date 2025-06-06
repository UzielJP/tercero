package Parcial_16_07_2022;

public class MaximoYMinimo extends Funcionalidades
{

	public MaximoYMinimo(HomeWeatherStation base) 
	{
		super(base);
	}
	
	private double maximo()
	{
		return this.getTemperaturasFarhrenheit().stream().max((a,b)->a.compareTo(b)).orElse(null);
	}
	
	private double minimo()
	{
		return this.getTemperaturasFarhrenheit().stream().min((a,b)->a.compareTo(b)).orElse(null);
	}

	@Override
	public String displayData() 
	{
		return base.displayData()+"Maximo: "+this.maximo()+"Minimo: "+this.minimo();
	}
	
	

}
