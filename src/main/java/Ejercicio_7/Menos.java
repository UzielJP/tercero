package Ejercicio_7;

public class Menos extends Operacion
{

	@Override
	public void setValor(Calculadora c, double v) 
	{
		c.agregarValor(c.getValor()-v);
		c.setEstado(new Inicial());
	}
	
}
