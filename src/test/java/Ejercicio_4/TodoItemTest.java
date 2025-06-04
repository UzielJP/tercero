package Ejercicio_4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoItemTest {

    private TodoItem todoItem;

    @BeforeEach
    public void setUp() {
        // Initialize a new TodoItem instance before each test
        todoItem = new TodoItem("tarea", "descripcion");
    }

    @Test
    public void testInitialState()
    {
        assertInstanceOf(Pending.class, todoItem.getState());
    }

    @Test
    public void testStart()
    {
        todoItem.start();
        assertInstanceOf(InProgress.class, todoItem.getState());
    }

    @Test
    public void testTogglePause() {
        todoItem.start();
        todoItem.togglePause();
        assertInstanceOf(Paused.class, todoItem.getState());
        todoItem.togglePause();
        assertInstanceOf(InProgress.class, todoItem.getState());
    }

    @Test
    public void testFinish() {
        todoItem.start();
        todoItem.finish();
        assertInstanceOf(Finished.class, todoItem.getState());
    }

}
