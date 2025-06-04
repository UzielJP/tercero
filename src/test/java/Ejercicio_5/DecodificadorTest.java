package Ejercicio_5;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {

    private Decodificador decodificador;
    private Pelicula pelicula1;
    private Pelicula pelicula2;
    private Pelicula pelicula3;
    private Pelicula pelicula4;
    private Pelicula pelicula5;
    private List<Pelicula> peliculas = new ArrayList<>();
    private Configuracion configuracionPuntaje;
    private Configuracion configuracionSimilaridad;
    private Configuracion configuracionNovedad;

    @BeforeEach
    public void setUp() throws Exception {
        Constructor<Decodificador> constructor = Decodificador.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        decodificador = constructor.newInstance();

        pelicula1 = new Pelicula("Titanic", LocalDate.of(1997, 12, 19), 8.5);
        pelicula2 = new Pelicula("The Godfather", LocalDate.of(1972, 3, 24), 9.2);
        pelicula3 = new Pelicula("Inception", LocalDate.of(2010, 7, 16), 8.8);
        pelicula4 = new Pelicula("titans", LocalDate.of(2009, 6, 2), 7.1);
        pelicula5 = new Pelicula("nosferatum", LocalDate.of(2000, 5, 12), 6.3);

        pelicula1.agrearSimilar(pelicula2);
        pelicula3.agrearSimilar(pelicula2);

        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);
        peliculas.add(pelicula5);

        configuracionPuntaje = new Puntaje();
        configuracionSimilaridad = new Similaridad();
        configuracionNovedad = new Novedad();
    }

    @Test
    public void testSugerirPorPuntaje()
    {
        decodificador.agregarPeliculaGrilla(peliculas);
        decodificador.setSujerencia(configuracionPuntaje);
        List<Pelicula> sugerenciar = decodificador.sugerir();
        assertEquals(3, sugerenciar.size());
        assertTrue(sugerenciar.contains(pelicula1));
        assertTrue(sugerenciar.contains(pelicula2));
        assertTrue(sugerenciar.contains(pelicula3));
    }

    @Test
    public void testSugerirPorSimilaridad()
    {
        decodificador.agregarPeliculaVista(peliculas);
        decodificador.setSujerencia(configuracionSimilaridad);
        List<Pelicula> sugerenciar = decodificador.sugerir();
        //sugerenciar.stream().forEach(a->System.out.println(a.getTitulo())); esto no esta bien no?
        assertTrue(sugerenciar.contains(pelicula1));
        assertTrue(sugerenciar.contains(pelicula2));
    }

}
