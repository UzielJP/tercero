package Ejercicio_20;

public class BuildMago extends BuilderPersonaje
{
	@Override
	public void asignarArma() 
	{
		this.personaje.setArma(new Baston());
	}

	@Override
	public void asignarArmadura() 
	{
		this.personaje.setArmadura(new ArmaduraCuero());
	}
	
	@Override
	public void asignarHabilidad()
	{
		
	}
}
