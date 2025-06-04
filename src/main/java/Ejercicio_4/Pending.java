package Ejercicio_4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

public class Pending extends ToDoItemStrategy{

	@Override
	public void start(TodoItem state)
	{
		state.setState(new InProgress());
		state.setInicio(LocalDate.now());
	}
	
	@Override
    public Duration workedTime(LocalDate Inicio, LocalDate fin)
    {
		throw new RuntimeException("El objeto ToDoItem no se encuentra Iniciado");
    }
    
}
