package Ejercicio_20;

public class BuildArquero extends BuilderPersonaje 
{

	@Override
	public void asignarArma() 
	{
		this.personaje.setArma(new Arco());
	}

	@Override
	public void asignarArmadura() 
	{
		this.personaje.setArmadura(new ArmaduraCuero());
	}

}
