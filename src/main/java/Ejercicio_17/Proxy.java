package Ejercicio_17;

import java.util.Collection;
import java.util.List;

public class Proxy implements DatabaseAccess
{
	
	private Cliente usuario;
	private DatabaseRealAccess service;
	
	public Proxy(DatabaseRealAccess service)
	{
		this.service = service;
	}

	public void setUsuario(Cliente usuario)
	{
		this.usuario = usuario;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) 
	{
		if(this.usuario.esIgual("Administrador"))
		{
			return this.service.getSearchResults(queryString);
		}
		else
		{
			throw new UnsupportedOperationException("El usuario no tiene permisos para realizar búsquedas."); 
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		
		if(this.usuario.esIgual("Administrador"))
		{
			return this.service.insertNewRow(rowData);
		}
		else
		{
			throw new UnsupportedOperationException("El usuario no tiene permisos para insertar lineas."); 
		}
		
	}

}
