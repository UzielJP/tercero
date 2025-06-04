package Ejercicio_4;

import java.time.Duration;
import java.time.LocalDate;

public class Finished extends ToDoItemStrategy{

	//Entiendo que una clase vacia es un pecado, pero en este caso es la mejor opcion que se me ocurrio.
	
	public Finished(TodoItem state)
	{
		state.setFin(LocalDate.now());
	}

    public Finished() {}
	
    @Override
    public void finish(TodoItem state) {}
    
    @Override
    public Duration workedTime(LocalDate Inicio, LocalDate Fin)
    {
    	return Duration.between(Inicio, Fin);
    }
    
    @Override
    public String addComment(String d,String comment)
    {
    	return d;
    }
}
