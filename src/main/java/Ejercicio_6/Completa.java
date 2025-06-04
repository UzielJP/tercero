package Ejercicio_6;

public class Completa extends ExcursionState{

	@Override
	public void inscribir(Excursion excursion, Usuario usuario) 
	{
		excursion.agregarListaEspera(usuario);
	}
	
	@Override
	public String dataExtra(Excursion excursion)
	{
		return ". ";
	}
}
