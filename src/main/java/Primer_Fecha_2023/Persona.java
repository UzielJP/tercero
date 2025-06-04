package Primer_Fecha_2023;

import java.util.Comparator;
import java.util.List;

public class Persona 
{
	private int Edad;
	private Promocion promocion;
	private List<Vehiculo> vehiculos;
	
	public int getEdad()
	{
		return this.Edad;
	}

	public double multiplicarPoredad(double monto)
	{
		return monto*this.Edad;
	}
	
	public double dividirPoredad(double monto)
	{
		return monto/this.Edad;
	}

	public void setPromocion(Promocion promocion) {
		this.promocion = promocion;
	}
	
	public Vehiculo seguroMasBarato()
	{
		return this.vehiculos.stream().min(Comparator.comparingDouble(v -> v.valorSeguro())).orElse(null);
	}
	
	public boolean polizasMayorADos()
	{
		return ((this.vehiculos.stream().mapToInt(a->a.contarPoliza()).sum())>=2);
	}
	
	public void aplicarDescuento(double descuento)
	{
		this.vehiculos.stream().forEach(a->a.restarValorSeguro(descuento));
	}
	
}
