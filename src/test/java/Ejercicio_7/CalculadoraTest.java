package Ejercicio_7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp()
    {
        calculadora = new Calculadora();
    }

    @Test
    public void testInitialState()
    {
        assertInstanceOf(Inicial.class, calculadora.getEstado());
        calculadora.setValor(1);
        assertEquals(1, calculadora.getValor());
        assertEquals("1.0", calculadora.getResultado());
    }

    @Test
    public void testMas()
    {
        calculadora.setValor(1);
        assertEquals(1, calculadora.getValor());
        calculadora.mas();
        assertInstanceOf(Mas.class, calculadora.getEstado());
        calculadora.setValor(1);
        assertEquals("2.0", calculadora.getResultado());
    }

    @Test
    public void testMenos()
    {
        calculadora.setValor(1);
        assertEquals(1, calculadora.getValor());
        calculadora.menos();
        assertInstanceOf(Menos.class, calculadora.getEstado());
        calculadora.setValor(1);
        assertEquals("0.0", calculadora.getResultado());
    }

    @Test
    public void testPor()
    {
        calculadora.setValor(1);
        assertEquals(1, calculadora.getValor());
        calculadora.por();
        assertInstanceOf(Por.class, calculadora.getEstado());
        calculadora.setValor(1);
        assertEquals("1.0", calculadora.getResultado());
    }

    @Test
    public void testDivision()
    {
        calculadora.setValor(1);
        assertEquals(1, calculadora.getValor());
        calculadora.dividir();
        assertInstanceOf(Dividir.class, calculadora.getEstado());
        calculadora.setValor(1);
        assertEquals("1.0", calculadora.getResultado());

        assertInstanceOf(Inicial.class, calculadora.getEstado());

        calculadora.setValor(1);
        assertEquals(1, calculadora.getValor());
        calculadora.dividir();
        assertInstanceOf(Dividir.class, calculadora.getEstado());
        calculadora.setValor(0);
        System.out.println(calculadora.getResultado());
        assertInstanceOf(Error.class, calculadora.getEstado());
    }

}
