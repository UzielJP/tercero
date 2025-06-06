package Parcial_Tercer_Fecha_2023;

public class Boton extends ComponenteVisual
{
	private String accion;

	public Boton(String texto) 
	{
		super(texto);
	}

	@Override
	public String imprimir() 
	{
		return this.getTexto()+this.getEstilo()+this.accion;
	}

	@Override
	public String estiloPropio(ConfiguracionDeEstilo estilo) 
	{
		return estilo.getEstiloBoton();
	}

}
