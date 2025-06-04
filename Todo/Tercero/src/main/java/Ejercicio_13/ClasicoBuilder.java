package Ejercicio_13;

public class ClasicoBuilder extends SangucheBuilder{

	@Override
	public void construirPan() 
	{
		ingredientes.add(new Ingrediente("pan brioche",100));
	}

	@Override
	public void construirAdereso() 
	{
		ingredientes.add(new Ingrediente("aderezo a base de mayonesa",20));
	}

	@Override
	public void construirPrincipal() 
	{
		ingredientes.add(new Ingrediente("principal de carne de ternera",300));	
	}

	@Override
	public void construirAdicional() 
	{
		ingredientes.add(new Ingrediente("adicional de tomate",80));		
	}

}
