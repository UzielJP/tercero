package Segundo_Recuperatorio_2024;

public abstract class Item 
{

	private int espacio;
	
	public Item(int espacio)
	{
		this.espacio=espacio;
	}
	
	public boolean entraDentro(int capacidad)
	{
		return this.espacio<=capacidad;
	}
	
	public Item guardarObjetos(Item item) 
	{
		return null;
	}
	
	public int capacidadTotalDisponible()
	{
		return 0;
	}
	
	public int capacidadMaxima()
	{
		return -1;
	}
	
	public abstract Item buscarItem(String nombre);
	
	protected boolean entro(Item item)
	{
		return false;
	}
	
	protected boolean hayCapacidad(Item item)
	{
		return item.entraDentro(this.getCapacidad());
	}
	
	protected int restarEspacio(int capacidad)
	{
		return capacidad-=this.espacio;
	}
	
	protected abstract int getCapacidad();
	
	protected int capacidadDisponible()
	{
		return 0;
	}
	
}
