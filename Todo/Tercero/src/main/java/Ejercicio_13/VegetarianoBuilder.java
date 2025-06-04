package Ejercicio_13;

public class VegetarianoBuilder extends SangucheBuilder{

	@Override
	public void construirPan() 
	{
		ingredientes.add(new Ingrediente("pan con semillas",120));
	}

	@Override
	public void construirAdereso() 
	{
		ingredientes.add(new Ingrediente("sin aderezo",0));
	}

	@Override
	public void construirPrincipal() 
	{
		ingredientes.add(new Ingrediente("principal de provoleta grillada",200));	
	}

	@Override
	public void construirAdicional() 
	{
		ingredientes.add(new Ingrediente("adicional de berenjenas al escabeche",100));		
	}
	
}
