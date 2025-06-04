package Ejercicio_6;

public class Definitiva extends ExcursionState{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) 
	{
		excursion.agregarLista(usuario);
		if(excursion.cupoMaximo())
		{
			excursion.setState(new Definitiva());
		}	
	}

	@Override
	public String dataExtra(Excursion excursion)
	{
		return ". "+excursion.getMails()+". "+excursion.faltanteMaximo();
	}
}
