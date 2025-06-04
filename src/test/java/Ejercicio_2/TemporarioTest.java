package Ejercicio_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemporarioTest {

    private Temporario temporario;

    @BeforeEach
    public void setUp()
    {
        temporario = new Temporario(0, false, 1);
        
    }

    @Test
    public void testAdicional() 
    {
    	assertEquals(0, temporario.adicional());
        temporario = new Temporario(1, false, 1);
        assertEquals(2000, temporario.adicional());
        temporario = new Temporario(0, true, 1);
        assertEquals(5000, temporario.adicional());
        temporario = new Temporario(1, true, 1);
        assertEquals(7000, temporario.adicional());
    }

}
