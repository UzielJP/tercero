package Ejercicio_16;

import java.time.LocalDate;
import java.util.List;

public class Presupuesto 
{
	
	private List<Componente> especificaciones;
	private String nombre;
	private LocalDate fecha;
	
	public Presupuesto(LocalDate fecha,String nombre)
	{
		this.fecha=fecha;
		this.nombre=nombre;
	}
	
	public void agregarComponente(Componente c)
	{
		this.especificaciones.add(c);
	}
	
	public double calcularPrecio()
	{
		return this.especificaciones.stream().mapToDouble(a->a.getPrecio()).sum();
	}
	
	public double calcularConsumo()
	{
		return this.especificaciones.stream().mapToDouble(a->a.getConsumo()).sum();
	}
	
}
