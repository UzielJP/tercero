package Ejercicio_13;

public class VeganoBuilder extends SangucheBuilder
{
	
	@Override
	public void construirPan() 
	{
		ingredientes.add(new Ingrediente("pan integral",100));
	}

	@Override
	public void construirAdereso() 
	{
		ingredientes.add(new Ingrediente("aderezo de salsa criolla",20));
	}

	@Override
	public void construirPrincipal() 
	{
		ingredientes.add(new Ingrediente("principal de milanesa de girgolas",500));	
	}

	@Override
	public void construirAdicional() 
	{
		ingredientes.add(new Ingrediente(" sin adicional",0));		
	}
	
}
