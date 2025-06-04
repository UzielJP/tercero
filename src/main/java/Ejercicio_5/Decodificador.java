package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> grilla;
	private List<Pelicula> vistas;
	private Configuracion sujerencia;
	
	public Decodificador()
	{
		this.grilla= new ArrayList<Pelicula>();
		this.vistas= new ArrayList<Pelicula>();
	}

	public void agregarPeliculaVista(List<Pelicula> p)
	{
		this.vistas.addAll(p);
	}

	public void agregarPeliculaGrilla(List<Pelicula> p)
	{
		this.grilla.addAll(p);
	}

	public List<Pelicula> sugerir()
	{
		return this.sujerencia.sugerir(this);
	}
	
	public List<Pelicula> getVistas()
	{
		return this.vistas;
	}
	
	public List<Pelicula> getGrilla()
	{
		return this.grilla;
	}
	
	public void setSujerencia(Configuracion c)
	{
		this.sujerencia=c;
	}
}
