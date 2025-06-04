package Ejercicio_17;

public class Cliente 
{

	private String permiso;
	
	public Cliente(String permiso) 
	{
		this.permiso = permiso;
	}

	public String getPermiso() 
	{
		return permiso;
	}
	
	public boolean esIgual(String s)
	{
		return this.permiso.equals(s);
	}

}
