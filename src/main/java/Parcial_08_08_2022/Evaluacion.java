package Parcial_08_08_2022;

public class Evaluacion extends EtapaEstado
{
	@Override
	public void aprobarEtapa(Proyecto proyecto)
	{
		proyecto.setEstado(new Confirmado());
	}
	
	@Override
	public void modificarMargenGanancia(Proyecto proyecto,int margen)
	{
		if((margen>=11)&&(margen<=15))
		{
			proyecto.aumentarElMargen(margen);;
		}
	}
}
