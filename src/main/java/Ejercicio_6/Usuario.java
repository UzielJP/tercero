package Ejercicio_6;

public class Usuario {

	private String nombre;
	private String apellido;
	private String mail;

	public Usuario() {}

	public Usuario(String mail, String apellido, String nombre) {
		this.mail = mail;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	public String getMail()
	{
		return this.mail;
	}
	
}
