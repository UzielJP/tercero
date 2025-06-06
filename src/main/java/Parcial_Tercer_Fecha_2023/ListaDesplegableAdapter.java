package Parcial_Tercer_Fecha_2023;

public class ListaDesplegableAdapter implements Componente
{

	private ListaDesplegableAdaptado lista;
	public ListaDesplegableAdapter(){}

	@Override
	public String imprimir() 
	{
		return this.lista.print();
	}

	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) 
	{
		this.lista.setStyle(estilo.getEstiloEtiqueta());
	}

	
}
