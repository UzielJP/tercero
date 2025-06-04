package Ejercicio_12;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorioTest {

    private Directorio directorio;
    private Archivo archivo1;
    private Archivo archivo2;
    private Directorio subdirectorio;

    @BeforeEach
    public void setUp()
    {
        // Initialize a new Directorio instance before each test
        directorio = new Directorio("d1");
        subdirectorio = new Directorio("d2");

        // Create test files
        archivo1 = new Archivo("a1", 1, LocalDate.of(2023, 1, 15));
        archivo2 = new Archivo("a2", 2,LocalDate.of(2023, 1, 16));

        subdirectorio.agregarHijo(archivo1);
        subdirectorio.agregarHijo(archivo2);

        directorio.agregarHijo(subdirectorio);
        directorio.agregarHijo(archivo1);

    }

    @Test
    public void testTamanoTotalOcupado()
    {
        assertEquals(3, subdirectorio.tamanoTotalOcupado());
    }

    @Test
    public void testArchivoMasGrande()
    {
        assertEquals(archivo2, directorio.archivoMasGrande());
    }

    @Test
    public void testArchivoMasNuevo()
    {
        assertEquals(archivo2, directorio.archivoMasNuevo());
    }

    @Test
    public void testBuscar()
    {
        assertEquals(archivo1, directorio.buscar("a1"));
        assertEquals(subdirectorio, directorio.buscar("d2"));
    }

    @Test
    public void testBuscarTodos()
    {
        assertEquals(2, directorio.buscarTodos("a1").size());
    }

}
