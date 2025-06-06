package Parcial_Tercer_Fecha_2023;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Contenedor implements Componente
{

	private List<Componente> componentes;
	
	public Contenedor()
	{
		this.componentes= new LinkedList<Componente>();
	}
	
	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) 
	{
		this.componentes.stream().forEach(a->a.aplicarEstilo(estilo));
	}

	@Override
	public String imprimir() 
	{
		System.out.print("<Contenedor>\n");
		return "<Contenedor>\n"+this.componentes.stream().map(a->a.imprimir()).collect(Collectors.joining("\n"))+"</Contenedor>\"";
	}

}
