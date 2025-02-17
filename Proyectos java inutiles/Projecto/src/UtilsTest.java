import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    void testTipoTriangulo() {
    	String resultado = Utils.tipoTriangulo(3, 3, 3);
        
        assertEquals("EQUILATERO", resultado);
        
        assertEquals("Debería ser un triángulo isósceles", "ISOSCELES", Utils.tipoTriangulo(5, 5, 8));

        assertEquals("Debería ser un triángulo escaleno", "ESCALENO", Utils.tipoTriangulo(3, 4, 5));

        assertEquals("Debería devolver ERROR porque no forma un triángulo", "ERROR", Utils.tipoTriangulo(1, 2, 7));
    }

    @Test
    void testEsTriangulo() {     
        assertTrue(Utils.esTriangulo(5, 7, 8), "5, 7, 8 debería formar un triángulo");

        assertFalse(Utils.esTriangulo(1, 2, 3), "1, 2, 3 no debería formar un triángulo");
    }

    @Test
    void testMasFrecuenteInt() {
        int[] numeros1 = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        assertEquals(4, Utils.masFrecuenteInt(numeros1), "El número más frecuente debería ser 4");

        int[] numeros2 = {1, 2, 3};
        assertEquals(1, Utils.masFrecuenteInt(numeros2), "Debería devolver el primer número, 1, en caso de empate");
    }

    @Test
    void testBuscarInt() {
        int[] lista = {2, 3, 4, 6, 3, 3, 2, 5, 6, 8, 9, 6, 5, 4};
        int num = 4;
        assertEquals(2, Utils.buscarInt(lista, num), "La posición de 4 debería ser 2");

        num = 10;
        assertEquals(-1, Utils.buscarInt(lista, num), "Debería devolver -1 si el número no está presente");
    }
}
