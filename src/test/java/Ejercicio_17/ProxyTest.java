package Ejercicio_17;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    private Proxy proxy;
    private DatabaseRealAccess realAccess;
    private Cliente adminUser;
    private Cliente regularUser;

    @BeforeEach
    public void setUp()
    {
        realAccess = new DatabaseRealAccess();

        proxy = new Proxy(realAccess);

        adminUser = new Cliente("Administrador");
        regularUser = new Cliente("Usuario");
    }

    @Test
    public void testGetSearchResultsAsAdmin() 
    {
        proxy.setUsuario(adminUser);
        assertEquals(2,proxy.getSearchResults("select * from comics where id=1").size());
    }

    @Test
    public void testGetSearchResultsAsRegularUser() throws Exception 
    {
        proxy.setUsuario(regularUser);
        assertThrows(UnsupportedOperationException.class, () -> proxy.getSearchResults("select * from comics where id=1"));
    }

    @Test
    public void testInsertNewRowAsAdmin() 
    {
        proxy.setUsuario(adminUser);
        assertEquals(3,proxy.insertNewRow( Arrays.asList("1","2","3") ));
    }

    @Test
    public void testInsertNewRowAsRegularUser() throws Exception 
    {
        proxy.setUsuario(regularUser);
        assertThrows(UnsupportedOperationException.class, () -> proxy.getSearchResults("select * from comics where id=1"));
    }
}
