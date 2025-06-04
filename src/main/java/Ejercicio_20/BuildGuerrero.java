package Ejercicio_20;

public class BuildGuerrero extends BuilderPersonaje
{

	@Override
	public void asignarArma() 
	{
		this.personaje.setArma(new Espada());
	}

	@Override
	public void asignarArmadura() 
	{
		this.personaje.setArmadura(new ArmaduraAcero());
	}
	
}
