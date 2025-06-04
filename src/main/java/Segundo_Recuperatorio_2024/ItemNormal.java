package Segundo_Recuperatorio_2024;

import java.util.List;

public class ItemNormal extends Item
{
	
	private String nombre;

	public ItemNormal(int espacio,String nombre) 
	{
		super(espacio);
		this.nombre=nombre;
	}

	@Override
	public Item buscarItem(String nombre)
	{
		if(this.nombre.equals(nombre))
		{
			return this;
		}
		return null;
	}
	
	@Override
	protected int getCapacidad()
	{
		return -1;
	}

}
