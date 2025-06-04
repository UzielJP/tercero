package Ejercicio_13;

public class Empleado {

	public Producto construirSanguche(SangucheBuilder sb)
	{
		sb.reset();
		sb.construirPan();
		sb.construirAdereso();
		sb.construirPrincipal();
		sb.construirAdicional();
		return sb.getResultado();
	}
	
}
