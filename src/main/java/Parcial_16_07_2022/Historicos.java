package Parcial_16_07_2022;

public class Historicos extends Funcionalidades
{

	public Historicos(HomeWeatherStation base) 
	{
		super(base);
	}

	@Override
	public String displayData() 
	{
		return base.displayData()+"Historicos: "+this.getTemperaturasFarhrenheit().stream().mapToDouble(a->a).average();
	}
	
}
