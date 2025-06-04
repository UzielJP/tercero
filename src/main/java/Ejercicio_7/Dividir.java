package Ejercicio_7;

public class Dividir extends Operacion{

	@Override
	public void setValor(Calculadora c, double v) 
	{
		if(v==0)
		{
			c.setEstado(new Error());
		}
		else
		{
			c.agregarValor(c.getValor()/v);
			c.setEstado(new Inicial());
		}
	}
	
}
