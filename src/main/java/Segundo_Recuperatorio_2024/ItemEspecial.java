package Segundo_Recuperatorio_2024;

import java.util.LinkedList;
import java.util.List;

public class ItemEspecial extends Item
{

	private List<Item> listaItems;
	private int capacidad;
	private int capacidadUsada;
	
	public ItemEspecial(int espacio,int capacidad) 
	{
		super(espacio);
		this.capacidad=capacidad;
		this.capacidadUsada=0;
		this.listaItems= new LinkedList<Item>();
	}
	
	@Override
	public Item buscarItem(String nombre)
	{
		return this.listaItems.stream().filter(a->a.buscarItem(nombre)!=null).findFirst().orElse(null);
	}
	
	@Override
	public int capacidadTotalDisponible()
	{
		return this.capacidadDisponible()+this.listaItems.stream().mapToInt(a->a.capacidadTotalDisponible()).sum();
	}
	
	@Override
	protected int capacidadDisponible()
	{
		return this.capacidad-this.capacidadUsada;
	}
	
	@Override
	public int capacidadMaxima()
	{
		int valor = this.listaItems.stream().mapToInt(a->a.capacidadMaxima()).max().orElse(-1);
		if(valor < this.capacidad)
		{
			return this.capacidad;
		}
		return valor;
	}
	
	public boolean guardarItem(Item item)
	{
		Item valor = this.encontrarEspacio(item);
		if(valor!=null)
		{
			return valor.entro(item);
		}
		return false;
	}

	public Item encontrarEspacio(Item item) 
	{
		if(item.entraDentro(capacidad))
		{
			return this;
		}
		Item buscar = this.listaItems.stream().filter(a->a.hayCapacidad(item)).min((a,b)->a.masEspacio(b)).orElse(null);
		return buscar;
	}
	
	@Override
	protected boolean entro(Item item)
	{
		this.capacidad-=item.restarEspacio(capacidad);
		return this.listaItems.add(item);
	}

	@Override
	protected int getCapacidad() 
	{
		return this.capacidad;
	}

}
