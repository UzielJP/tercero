package Ejercicio_18;

public class FileOO2 implements FileManager{

	public String nombre;
	public String extension;
	public String fechaCreacion;
	public String fechaModificacion;
	public String tamanio;
	public String permisos;
	
	public FileOO2(String nombre, String extension, String fechaCreacion, String fechaModificacion, String tamanio,String permisos) 
	{
		this.nombre = nombre;
		this.extension = extension;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.tamanio = tamanio;
		this.permisos = permisos;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getExtension() {
		return extension;
	}
	
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	
	public String getFechaModificacion() {
		return fechaModificacion;
	}
	
	public String getTamanio() {
		return tamanio;
	}
	
	public String getPermisos() {
		return permisos;
	}

	@Override
	public String prettyPrint() 
	{
		return "";
	}
	
}
