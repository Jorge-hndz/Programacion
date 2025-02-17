import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class EstudianteTest {
	
    Estudiante e1;
    Estudiante e2;
    Estudiante e3;

	@BeforeEach
	void crearEstudiantes() {
		e1 = new Estudiante("Juan", 19, 7);
		e2 = new Estudiante("Pablo", 17, 9);
		e3 = new Estudiante("Alberto", 16, 5);
	}
	
	
	@Test
    void testGetNombre() {
        assertEquals("Juan", e1.getNombre());
        assertEquals("Pablo", e2.getNombre());
        assertEquals("Alberto", e3.getNombre());
        assertNotEquals("Carlos", e3.getNombre());
    }
	
	@Test
    void testGetEdad() {
        assertEquals(19, e1.getEdad());
        assertEquals(17, e2.getEdad());
        assertEquals(16, e3.getEdad());
        assertNotEquals(12, e3.getEdad());
    }
	
	@Test
    void testGetNota() {
        assertEquals(7, e1.getNota());
        assertEquals(9, e2.getNota());
        assertEquals(5, e3.getNota());
        assertNotEquals(8, e3.getNota());
    }
	
	@Test
    void testObtenerEstadoAcademico() {
        assertEquals("Notable", e1.obtenerEstadoAcademico());
        assertEquals("Sobresaliente", e2.obtenerEstadoAcademico());
        assertEquals("Aprobado", e3.obtenerEstadoAcademico());
        assertNotEquals("Notable", e3.obtenerEstadoAcademico());
    }

}
