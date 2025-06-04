package Ejercicio_11;

public interface Celda {

	public abstract double proporcionAgua();
	public abstract double proporcionTierra();
	public abstract boolean comparar(Celda c);
	public abstract boolean conAgua();
	public abstract boolean conTierra();
	public abstract boolean conPantano();
	public abstract boolean ConMixta(Imagen mixta);
	
}
