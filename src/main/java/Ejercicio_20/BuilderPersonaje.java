package Ejercicio_20;

public abstract class BuilderPersonaje 
{
	protected Personaje personaje;
	
	public void reset()
	{
		personaje = new Personaje();
	}
	
	public Personaje resultado()
	{
		return this.personaje;
	}
	
	public void asignarHabilidad(){}
	
	public abstract void asignarArma();
	public abstract void asignarArmadura();
	
}
