package Ejercicio_11;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImagenTest {

    private Imagen imagen;
    private Celda agua;
    private Celda tierra;
    private Celda pantano;
    private  List<Celda> celdas;

    @BeforeEach
    public void setUp()
    {

        celdas = new ArrayList<>();

        agua = new Agua();
        tierra = new Tierra();
        pantano = new Pantano();

        imagen = new Imagen();
    }

    @Test
    public void testProporcionAgua()
    {
        imagen.agregarCeldas(agua);
        imagen.agregarCeldas(agua);
        imagen.agregarCeldas(agua);
        imagen.agregarCeldas(agua);

        assertEquals(1, imagen.proporcionAgua());
    }

    @Test
    public void testProporcionTierra()
    {
        imagen.agregarCeldas(tierra);
        imagen.agregarCeldas(tierra);
        imagen.agregarCeldas(tierra);
        imagen.agregarCeldas(tierra);

        assertEquals(1, imagen.proporcionTierra());
    }

    @Test
    public void testConMixta()
    {

        Imagen imagen2 = new Imagen();
        imagen2.agregarCeldas(tierra);
        imagen2.agregarCeldas(tierra);
        imagen2.agregarCeldas(tierra);
        imagen2.agregarCeldas(tierra);
        imagen2.getCeldas().stream().forEach(a -> System.out.println(a.getClass().getSimpleName()));

        Imagen imagen3 = new Imagen();
        imagen3.agregarCeldas(tierra);
        imagen3.agregarCeldas(tierra);
        imagen3.agregarCeldas(tierra);
        imagen3.agregarCeldas(tierra);
        imagen3.getCeldas().stream().forEach(a -> System.out.println(a.getClass().getSimpleName()));

        assertTrue(imagen2.ConMixta(imagen3));

        Imagen imagen4 = new Imagen();
        imagen4.agregarCeldas(agua);
        imagen4.agregarCeldas(agua);
        imagen4.agregarCeldas(agua);
        imagen4.agregarCeldas(agua);
        imagen4.getCeldas().stream().forEach(a -> System.out.println(a.getClass().getSimpleName()));


        Imagen imagen5 = new Imagen();
        imagen5.agregarCeldas(tierra);
        imagen5.agregarCeldas(tierra);
        imagen5.agregarCeldas(tierra);
        imagen5.agregarCeldas(tierra);
        imagen5.getCeldas().stream().forEach(a -> System.out.println(a.getClass().getSimpleName()));

        assertFalse(imagen4.ConMixta(imagen5));


    }
}
