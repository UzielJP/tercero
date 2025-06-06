package Parcial_16_07_2022;

public class GradosCelcius extends Funcionalidades
{

	public GradosCelcius(HomeWeatherStation base) 
	{
		super(base);
	}
	
	@Override
	public String displayData() 
	{
		return base.displayData()+"Grados Celcius: "+((this.getTemperaturaFarhrenheit()-32)/1.8);
	}

}
