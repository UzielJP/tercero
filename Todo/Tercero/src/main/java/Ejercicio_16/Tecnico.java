package Ejercicio_16;

import java.time.LocalDate;

public class Tecnico 
{
	
	public Presupuesto crearPresupuesto(BuilderPC b,LocalDate fecha,String nombre)
	{
		b.reset(fecha, nombre);
		b.agregarProcesador();
		b.agregarRam();
		b.agregarDisco();
		b.agregarGrafica();
		b.agregarGabinete();
		return b.getResultado();
	}
	
}
