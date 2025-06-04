package Ejercicio_6;

public abstract class ExcursionState {

	public abstract void inscribir(Excursion excursion, Usuario usuario);
	
	public String obtenerInformacion(Excursion excursion)
	{
		return excursion.toString()+this.dataExtra(excursion);
	}
	
	public abstract String dataExtra(Excursion excursion);
}
