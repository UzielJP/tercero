package Parcial_16_07_2022;

import java.util.List;

public interface WeatherData 
{
	
	public abstract double getTemperaturaFarhrenheit();
	public abstract String displayData();
	public abstract double getPresion();
	public abstract double getRadiacionSolar();
	public List<Double> getTemperaturasFarhrenheit();

}
