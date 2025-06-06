package Parcial_Tercer_Fecha_2023;

public class Etiqueta extends ComponenteVisual
{

	public Etiqueta(String texto) 
	{
		super(texto);
	}

	@Override
	protected String estiloPropio(ConfiguracionDeEstilo estilo) 
	{
		return estilo.getEstiloEtiqueta();
	}

	@Override
	public String imprimir() {
		return this.getTexto()+this.getEstilo();
	}

}
