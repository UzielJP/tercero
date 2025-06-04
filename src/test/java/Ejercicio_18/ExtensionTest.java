package Ejercicio_18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExtensionTest {

    private FileManager file;
    private String nombre;
    private String extensionValue;
    private String fechaCreacion;
    private String fechaModificacion;
    private String tamanio;
    private String permisos;

    @BeforeEach
    public void setUp() {
        // Initialize test data
        nombre = "documento";
        extensionValue = "txt";
        fechaCreacion = "2023-01-15";
        fechaModificacion = "2023-05-20";
        tamanio = "1024 KB";
        permisos = "rw-r--r--";

        file = new FileOO2(nombre, extensionValue, fechaCreacion, fechaModificacion, tamanio, permisos);
    }

    @Test
    public void testGetNombre()
    {
        FileManager extension1 = new Extension(file);
        FileManager nombre1 = new Nombre(extension1);
        assertEquals(""+" - "+extensionValue+" - "+nombre, nombre1.prettyPrint());
    }

    @Test
    public void testGetExtension()
    {
        FileManager extension1 = new Extension(file);
        assertEquals("" + " - " + extensionValue, extension1.prettyPrint());
    }

    @Test
    public void testGetFechaCreacion()
    {
        FileManager extension1 = new Extension(file);
        FileManager nombre1 = new Nombre(extension1);
        FileManager fechaC = new FechaCreacion(nombre1);
        assertEquals("" + " - " + extensionValue + " - " + nombre +" - " + fechaC, fechaC.prettyPrint());
    }

    @Test
    public void testGetFechaModificacion()
    {
        FileManager extension1 = new Extension(file);
        FileManager nombre1 = new Nombre(extension1);
        FileManager fecha1 = new FechaCreacion(nombre1);
        FileManager fecha2 = new FechaModificacion(fecha1);
        assertEquals(""+" - "+extensionValue+" - "+nombre+" - "+fecha1+" - "+fecha2, fecha2.prettyPrint());
    }

    @Test
    public void testGetTamanio()
    {
        FileManager extension1 = new Extension(file);
        FileManager nombre1 = new Nombre(extension1);
        FileManager fecha1 = new FechaCreacion(nombre1);
        FileManager fecha2 = new FechaModificacion(fecha1);
        FileManager tamanio1 = new Tamanio(fecha2);
        assertEquals(""+" - "+extensionValue+" - "+nombre+" - "+fecha1+" - "+fecha2+" - "+tamanio1, tamanio1.prettyPrint());
    }

    @Test
    public void testGetPermisos()
    {
        FileManager extension1 = new Extension(file);
        FileManager nombre1 = new Nombre(extension1);
        FileManager fecha1 = new FechaCreacion(nombre1);
        FileManager fecha2 = new FechaModificacion(fecha1);
        FileManager tamanio1 = new Tamanio(fecha2);
        FileManager permisos1 = new Permisos(tamanio1);
        assertEquals(""+" - "+extensionValue+" - "+nombre+" - "+fecha1+" - "+fecha2+" - "+tamanio1+" - "+permisos1, permisos1.prettyPrint());
    }

    //No se como hacer test en Decorator
}
