package Parcial_16_07_2022;

import java.util.LinkedList;
import java.util.List;

public class HomeWeatherStation implements WeatherData
{

	@Override
	public double getTemperaturaFarhrenheit() 
	{
		return 100;
	}

	@Override
	public String displayData() 
	{
		return "";
	}

	@Override
	public double getPresion() 
	{
		return 10;
	}

	@Override
	public double getRadiacionSolar() 
	{
		return 10;
	}

	@Override
	public List<Double> getTemperaturasFarhrenheit() 
	{
		return new LinkedList<Double>();
	}
	

}
