package Ejercicio_11;

import java.util.ArrayList;
import java.util.List;

public class Imagen implements Celda
{
	private List<Celda> celdas;

	public Imagen(List<Celda> celdas)
	{
		this.celdas = celdas;
	}

	public void agregarCeldas(Celda c)
	{
		this.celdas.add(c);
	}

	public Imagen()
	{
		this.celdas = new ArrayList<>();
	}

	public void vaciar()
	{
		this.celdas.clear();
	}

	@Override
	public double proporcionAgua()
	{
		return this.celdas.stream().mapToDouble(a->a.proporcionAgua()).sum()/4;
	}

	@Override
	public double proporcionTierra() 
	{
		return this.celdas.stream().mapToDouble(a->a.proporcionTierra()).sum()/4;
	}

	@Override
	public boolean conAgua() 
	{
		return false;
	}

	@Override
	public boolean conTierra() 
	{
		return false;
	}

	@Override
	public boolean conPantano() 
	{
		return false;
	}

	@Override
	public boolean comparar(Celda c) 
	{
		return c.ConMixta(this);
	}

	public List<Celda> getCeldas()
	{
		return this.celdas;
	}

	//TODO 1: hacer con un for: https://stackoverflow.com/questions/3833814/java-how-to-write-a-zip-function-what-should-be-the-return-type
	
	//TODO 2: hacer @Override del metodo equals(): llamar a feli.
	@Override
	public boolean ConMixta(Imagen mixta) {
		return this.celdas.get(0).equals(mixta.getCeldas().get(0)) &&
				this.celdas.get(1).equals(mixta.getCeldas().get(1)) &&
				this.celdas.get(2).equals(mixta.getCeldas().get(2)) &&
				this.celdas.get(3).equals(mixta.getCeldas().get(3));
		
	}

	
}
