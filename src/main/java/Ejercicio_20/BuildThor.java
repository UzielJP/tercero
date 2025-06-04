package Ejercicio_20;

public class BuildThor extends BuilderPersonaje
{

	@Override
	public void asignarArma() 
	{
		this.personaje.setArma(new Martillo());
	}

	@Override
	public void asignarArmadura() 
	{
		this.personaje.setArmadura(new ArmaduraHierro());
	}
	
}
