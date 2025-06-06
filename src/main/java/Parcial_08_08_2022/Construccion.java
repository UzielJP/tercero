package Parcial_08_08_2022;

public class Construccion extends EtapaEstado
{
	@Override
	public void aprobarEtapa(Proyecto proyecto)
	{
		if(proyecto.precioDistiantoDe(0))
		{
			proyecto.setEstado(new Evaluacion());
		}
		else
		{
			throw new RuntimeException("Este es mi mensaje de error");
		}
	}
	
	@Override
	public void modificarMargenGanancia(Proyecto proyecto,int margen)
	{
		if((margen>=8)&&(margen<=10))
		{
			proyecto.aumentarElMargen(margen);;
		}
	}
}
