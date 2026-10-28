package ar.ejercicio18;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapse2Test {
	
	private DateInterface lapsoNormal;
	private DateInterface lapsoNegativo;
	private DateInterface lapsoNulo;
	
	@BeforeEach
	void setUp() {
		lapsoNormal = new DateLapse2(LocalDate.of(2025, 1, 1),10);
		lapsoNegativo = new DateLapse2(LocalDate.of(2025, 1, 11),-10);
		lapsoNulo = new DateLapse2(LocalDate.of(2025, 1, 1),0); 
	}
	
	@Test
	void testSizeInDays() {
	    assertEquals(10,lapsoNormal.sizeInDays());
	    assertEquals(-10,lapsoNegativo.sizeInDays());
	    assertEquals(0,lapsoNulo.sizeInDays());
	}
	
	@Test
	void testIncludesDateNormal() {
	    LocalDate limiteInferior = LocalDate.of(2025, 1, 1);
	    LocalDate limiteSuperior = LocalDate.of(2025, 1, 11);
	    
	    // Bordes exactos
	    assertTrue(lapsoNormal.includesDate(limiteInferior));
	    assertTrue(lapsoNormal.includesDate(limiteSuperior));
	    
	    // Exterior de los bordes
	    assertFalse(lapsoNormal.includesDate(limiteInferior.minusDays(1)));
	    assertFalse(lapsoNormal.includesDate(limiteSuperior.plusDays(1)));
	    
	    // Interior de los bordes
	    assertTrue(lapsoNormal.includesDate(limiteInferior.plusDays(1)));
	    assertTrue(lapsoNormal.includesDate(limiteSuperior.minusDays(1)));
	}

	@Test
	void testIncludesDateNegativo() {
	    LocalDate limiteInferior = LocalDate.of(2025, 1, 1); 
	    LocalDate limiteSuperior = LocalDate.of(2025, 1, 11);
	    
	    // Bordes exactos
	    assertTrue(lapsoNegativo.includesDate(limiteInferior));
	    assertTrue(lapsoNegativo.includesDate(limiteSuperior));
	    
	    // Exterior de los bordes
	    assertFalse(lapsoNegativo.includesDate(limiteInferior.minusDays(1)));
	    assertFalse(lapsoNegativo.includesDate(limiteSuperior.plusDays(1)));
	    
	    // Interior de los bordes
	    assertTrue(lapsoNegativo.includesDate(limiteInferior.plusDays(1)));
	    assertTrue(lapsoNegativo.includesDate(limiteSuperior.minusDays(1)));
	}

	@Test
	void testIncludesDateNulo() {
	    LocalDate fechaExacta = LocalDate.of(2025, 1, 1);
	    
	    // Borde exacto (único válido)
	    assertTrue(lapsoNulo.includesDate(fechaExacta));
	    
	    // Días inmediatamente anteriores y posteriores
	    assertFalse(lapsoNulo.includesDate(fechaExacta.minusDays(1)));
	    assertFalse(lapsoNulo.includesDate(fechaExacta.plusDays(1)));

	}
}
