package Ejercicio_4;

import java.time.Duration;
import java.time.LocalDate;

public class TodoItem {
	
	private String nombre;
	private String descripcion;
	private LocalDate inicio;
	private LocalDate fin;
	private ToDoItemStrategy state;
	
	public TodoItem(String nombre, String descripcion)
	{
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.state= new Pending();
		this.inicio=null;
		this.fin=null;
	}

	public ToDoItemStrategy getState()
	{
		return this.state;
	}
	
    public void start() 
    {
        state.start(this);
    }
	
    public void togglePause() 
    {
        state.togglePause(this);
    }

    public void finish() 
    {
        state.finish(this);
    }
	
	public void setInicio(LocalDate inicio)
	{
		this.inicio=inicio;
	}
	
	public Duration workedTime()
	{
		 return this.state.workedTime(inicio, fin);
	}
	
	public void addComment(String comentario)
	{
		this.descripcion = state.addComment(this.descripcion, comentario);
	}
	
	public void setFin(LocalDate fin)
	{
		this.fin=fin;
	}
	 
	//Una opcion para cambiar el setState es hacer:
	/*
	 
	    //Aca finish pordria retornar un state final si esta en paused o InProgress
    	//El drama esta en que si lo hago asi al final podria traerme problemas porque el ejercicio aclara "Si se encuentra en otro estado, no hace nada." y ante ese requisito no se como responder.
    	//La opcion mas saludable es usar el setState como nos enseñaron en la teoria, pero no estoy seguro.
    	
		public void finish() 
    	{	
        	this.state = state.finish();
    	}
    	
	*/
	
	public void setState(ToDoItemStrategy state)
	{
		this.state=state;
	}
	
}
