package Ejercicio_20;

import java.util.List;

public class Personaje 
{
	
	private String rol;
	private int vida;
	private Armadura armadura;
	private Arma arma;
	private List<Habilidad> habilidades;
	
	public void recibeDanio(Arma arma)
	{
		this.vida-=this.armadura.contra(arma);
	}
	
	public void contra(Personaje p)
	{
		p.recibeDanio(arma);
		this.recibeDanio(p.getArma());
	}
	
	public Arma getArma()
	{
		return this.arma;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public void agregarHabilidad(Habilidad h)
	{
		this.habilidades.add(h);
	}
	
}
