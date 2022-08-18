package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UtilidadesTest {
	
	private static Utilidades func;
	
	
	@BeforeAll
	static void inicializarFunciones() {
		func = new Utilidades();
	}

	@Test
	void devuelveNota() {
		assertEquals("Suspenso", func.devuelveNota(3.0));
		assertEquals("Bien", func.devuelveNota(5.0));
		assertEquals("Notable", func.devuelveNota(7.0));
		assertEquals("Sobresaliente", func.devuelveNota(9.0));
		assertEquals("Matrícula", func.devuelveNota(10.0));
		assertThrows(ArithmeticException.class, ()->func.devuelveNota(-2));
		assertThrows(ArithmeticException.class, ()->func.devuelveNota(11));
	}

}
