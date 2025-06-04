package Ejercicio_16;

import java.util.List;

public abstract class Catalogo 
{
	private List<Componente> componentes;
	public abstract Componente getComponente(String st);
}
