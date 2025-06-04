package Ejercicio_6;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {

    private Excursion excursion;
    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;

    @BeforeEach
    public void setUp() throws Exception {

        LocalDate fechaInicio = LocalDate.now().plusDays(30);
        LocalDate fechaFin = fechaInicio.plusDays(7);

        excursion = new Excursion("Dos días en kayak bajando el Paraná", "Plaza Central", 1500.0, fechaInicio, fechaFin, 2, 1);

        usuario1 = new Usuario("juan@example.com","Perez","Juan");
        usuario2 = new Usuario("maria@example.com","Lopez","Maria");
        usuario3 = new Usuario("carlos@example.com","Rodriguez","Carlos");

    }

    @Test
    public void testInscribirUsuarioEnExcursionProvisoria()
    {
        assertInstanceOf(Provisoria.class, excursion.getState());
        assertFalse(excursion.cupoMinimo());
        excursion.inscribir(usuario1);
        assertTrue(excursion.cupoMinimo());
        assertEquals(1,excursion.getInscriptos());
        assertInstanceOf(Definitiva.class, excursion.getState());
    }

    @Test
    public void testInscribirUsuarioHastaAlcanzarMinimo()
    {
        excursion.inscribir(usuario1);
        excursion.inscribir(usuario2);
        assertTrue(excursion.cupoMaximo());
        assertEquals(2,excursion.getInscriptos());
        assertInstanceOf(Completa.class, excursion.getState());
    }

    @Test
    public void testInscribirUsuarioHastaAlcanzarCompleto()
    {
        excursion.inscribir(usuario1);
        excursion.inscribir(usuario2);
        excursion.inscribir(usuario3);
        assertEquals(1,excursion.getEnEspera());
        assertInstanceOf(Completa.class, excursion.getState());
    }

}
