package Ejercicio_13;

public class SinTaccBuilder extends SangucheBuilder
{
	
	@Override
	public void construirPan() 
	{
		ingredientes.add(new Ingrediente("pan de chipá",150));
	}

	@Override
	public void construirAdereso() 
	{
		ingredientes.add(new Ingrediente("aderezo de salsa tártara",18));
	}

	@Override
	public void construirPrincipal() 
	{
		ingredientes.add(new Ingrediente("principal de carne de pollo",250));	
	}

	@Override
	public void construirAdicional() 
	{
		ingredientes.add(new Ingrediente("adicional de verduras grilladas",200));		
	}
	
}
