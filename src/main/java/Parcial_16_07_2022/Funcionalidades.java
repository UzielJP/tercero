package Parcial_16_07_2022;

import java.util.List;

public abstract class Funcionalidades implements WeatherData
{

	protected HomeWeatherStation base;
	
	public Funcionalidades(HomeWeatherStation base) 
	{
		this.base = base;
	}

	@Override
	public double getTemperaturaFarhrenheit() 
	{
		return base.getTemperaturaFarhrenheit();
	}

	@Override
	public double getPresion() 
	{
		return base.getPresion();
	}

	@Override
	public double getRadiacionSolar() 
	{
		return base.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturasFarhrenheit() 
	{
		return base.getTemperaturasFarhrenheit();
	}

}
