import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SesionTest {

    @Test
    public void testLoginCorrecto1() {
        assertTrue(Sesion.login("dmunuera", "123456"));
    }

    @Test
    public void testLoginCorrecto2() {
        assertTrue(Sesion.login("pepe", "654321")); 
    }

    @Test
    public void testLoginIncorrecto1() {
        assertFalse(Sesion.login("usuarioInvalido", "123456")); 
    }

    @Test
    public void testLoginIncorrecto2() {
        assertFalse(Sesion.login("dmunuera", "wrongpass")); 
    }
}

