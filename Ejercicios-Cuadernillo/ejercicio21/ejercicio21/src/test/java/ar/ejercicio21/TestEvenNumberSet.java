package ar.ejercicio21;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEvenNumberSet {
	
	
	private Set<Integer> setPares;
	
	@BeforeEach
	void setUp() {
		setPares = new EvenNumberSet();
	}
	
	@Test
	void testAdd() {
		assertFalse(setPares.add(1));
		assertTrue(setPares.add(2));
		assertTrue(setPares.add(4));
		assertFalse(setPares.add(2));
	}
	
}
