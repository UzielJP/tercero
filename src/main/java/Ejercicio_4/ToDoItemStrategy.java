package Ejercicio_4;

import java.time.Duration;
import java.time.LocalDate;

public abstract class ToDoItemStrategy {
	
	public void togglePause(TodoItem state) 
	{
        throw new RuntimeException("El objeto ToDoItem no se encuentra en in-progress o paused.");
    }
	
	public void start(TodoItem state){}

    public void finish(TodoItem state) {}
    
    public Duration workedTime(LocalDate Inicio, LocalDate fin)
    {
    	return Duration.between(Inicio, LocalDate.now());
    }
    
    public String addComment(String d,String comment)
    {
    	return d.concat(comment);
    }
    
}
