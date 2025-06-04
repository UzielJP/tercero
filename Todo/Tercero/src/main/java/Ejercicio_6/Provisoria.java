package Ejercicio_6;

public class Provisoria extends ExcursionState{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) 
	{
		excursion.agregarLista(usuario);
		if(excursion.cupoMinimo())
		{
			excursion.setState(new Definitiva());
		}	
	}
	
	@Override
	public String dataExtra(Excursion excursion)
	{
		return Integer.toString(excursion.faltanteMinimo());
	}
	
}
