package Parcial_08_08_2022;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto 
{
	
	private EtapaEstado estado;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private int numeroDeIntegrantes;
	private double montoPorIntegrante;
	private int margenDeGanancia;
	
	public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int numeroDeIntegrantes,double montoPorIntegrante, int margenDeGanancia) 
	{
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.numeroDeIntegrantes = numeroDeIntegrantes;
		this.montoPorIntegrante = montoPorIntegrante;
		this.margenDeGanancia = margenDeGanancia;
		this.estado = new Construccion();
	}
	
	void setEstado(EtapaEstado estado)
	{
		this.estado=estado;
	}
	
	public void cancelarProyecto()
	{
		if(this.cancelado())
		{
			this.objetivo="Cancelar";
		}
	}
	
	public boolean precioDistiantoDe(double precio)
	{
		return this.precioConMargen()>precio;
	}
	
	public double precioConMargen()
	{
		return this.costoDelProyecto()+(this.costoDelProyecto()*(this.margenDeGanancia/100));
	}
	
	public double costoDelProyecto()
	{
		return (this.montoPorIntegrante*this.numeroDeIntegrantes)*this.diasDuracion();
	}
	
	private double diasDuracion()
	{
		return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}
	
	void aumentarElMargen(int margen)
	{
		this.margenDeGanancia=margen;
	}
	
	public boolean margenMenorA(int margen)
	{
		return (this.margenDeGanancia<=margen);
	}
	
	public boolean margenMayorA(int margen)
	{
		return (this.margenDeGanancia>=margen);
	}
	
	public boolean cancelado()
	{
		return this.objetivo.equals("Cancelado");
	}
	
	void setObjetivo(String objetivo)
	{
		this.objetivo=objetivo;
	}
	
	public void aprobarEtapa()
	{
		this.estado.aprobarEtapa(this);
	}
	
	public void modificarMargenGanancia(int margen)
	{
		this.estado.modificarMargenGanancia(this, margen);
	}
	
}
