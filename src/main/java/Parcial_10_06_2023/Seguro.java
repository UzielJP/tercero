package Parcial_10_06_2023;

public abstract class Seguro 
{
	
		public double asignarCoberturaDeVida(Vehiculo vehiculo, Persona persona)
		{
			return (this.multiplicaCobertura(this.montoCoberturaVida(),vehiculo,persona));
		}
		
		protected abstract double montoCoberturaVida();
		protected abstract double multiplicaCobertura(double monto,Vehiculo vehiculo, Persona persona);
		
		public double asignarCoberturaDeDanios(Vehiculo vehiculo, Persona persona)
		{
			return this.calculoCoberturaDeDanios(this.montoCoberturaDeDanios(),vehiculo,persona);
		}
		
		protected abstract double montoCoberturaDeDanios();
		protected abstract double calculoCoberturaDeDanios(double monto,Vehiculo vehiculo, Persona persona);
		
		public double asignarCoberturaDeDestruccion(Vehiculo vehiculo)
		{
			return vehiculo.multiplicarPorValor(0.5)+this.calculoCoberturaDeDestruccion(vehiculo);
		}
		
		protected abstract double calculoCoberturaDeDestruccion(Vehiculo vehiculo);
		
}
