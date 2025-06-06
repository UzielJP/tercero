package Parcial_Tercer_Fecha_2023;

public abstract class ComponenteVisual implements Componente
{
	
	private String texto;
	private String Estilo;
	
	public ComponenteVisual(String texto)
	{
		this.texto=texto;
	}
	
	public ComponenteVisual() {}
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo)
	{
		this.Estilo=this.estiloPropio(estilo);
	}
	
	protected abstract String estiloPropio(ConfiguracionDeEstilo estilo);
	
	protected String getTexto()
	{
		return this.texto;
	}
	
	protected String getEstilo()
	{
		return this.texto;
	}
}
