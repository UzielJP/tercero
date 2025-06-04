package Ejercicio_18;

public abstract class BaseAspecto implements FileManager
{

	private FileManager file;
	
	protected BaseAspecto(FileManager file) 
	{
		this.file = file;
	}

	public String getNombre() {
		return this.file.getNombre();
	}
	
	public String getExtension() {
		return this.file.getExtension();
	}
	
	public String getFechaCreacion() {
		return this.file.getFechaCreacion();
	}
	
	public String getFechaModificacion() {
		return this.file.getFechaModificacion();
	}
	
	public String getTamanio() {
		return this.file.getTamanio();
	}
	
	public String getPermisos() {
		return this.file.getPermisos();
	}

	@Override
	public String prettyPrint() 
	{
		return this.file.prettyPrint()+" - "+ this.caracteristica();
	}
	
	public abstract String caracteristica();
	
}
