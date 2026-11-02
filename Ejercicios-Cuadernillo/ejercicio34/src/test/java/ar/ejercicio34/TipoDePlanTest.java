package ar.ejercicio34;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TipoDePlanTest {

	private TipoDePlan planIndividual;
	private TipoDePlan planGrupal;
	
	@BeforeEach
	void setUp() {
		planIndividual = new PlanIndividual(1); // particiones: de 0 a 1 y de 2 a max. Se testean 0,1,2,3
		planGrupal = new PlanGrupal(5); // particiones: de 0 a 5 y de 6 a max. Se testean 0,5 y 6 (valores borde) y 1,4,6,7
	}
	
	@Test
	void calcularPenalizacionSinIPsTest() {
		// valor de borde
		assertEquals(0, planIndividual.calcularPenalizacion(0, 0));
		// valor de borde
		assertEquals(0, planGrupal.calcularPenalizacion(0, 0));
	}
	@Test
	void calcularPenalizacionCon1IP() {
		// valor de borde
		assertEquals(0, planIndividual.calcularPenalizacion(1, 0));
		// valor de borde + 1
		assertEquals(0, planGrupal.calcularPenalizacion(1, 0));
	}
	@Test
	void calcularPenalizacionCon2IP() {
		// valor de borde
		assertEquals(300, planIndividual.calcularPenalizacion(2, 0));
	}
	@Test
	void calcularPenalizacionCon3IP() {
		// valor de borde + 1
		assertEquals(600, planIndividual.calcularPenalizacion(3, 0));
	}
	@Test
	void calcularPenalizacionCon4IP() {
		// valor de borde - 1
		assertEquals(0, planGrupal.calcularPenalizacion(4, 0));
	}
	@Test
	void calcularPenalizacionCon5IP() {
		// valor de borde
		assertEquals(0, planGrupal.calcularPenalizacion(5, 0));
	}
	@Test
	void calcularPenalizacionCon6IP() {
		// valor de borde
		assertEquals(500, planGrupal.calcularPenalizacion(6, 0));
	}
	@Test
	void calcularPenalizacionCon7IP() {
		// valor de borde + 1
		assertEquals(1000, planGrupal.calcularPenalizacion(7, 0));
	}
	@Test
	void calcularPenalizacionConAntiguedad() {
		// particion de antiguedad: de 0 a 10 y de 11 para max
		// valores borde: 0, 10, 11. Se testean esos y: 1, 9, 12
		assertEquals(1000, planGrupal.calcularPenalizacion(7, 0));
		assertEquals(1000, planGrupal.calcularPenalizacion(7, 1));
		assertEquals(1000, planGrupal.calcularPenalizacion(7, 9));
		assertEquals(1000, planGrupal.calcularPenalizacion(7, 10));
		assertEquals(0, planGrupal.calcularPenalizacion(7, 11));
		assertEquals(0, planGrupal.calcularPenalizacion(7, 12));
	}
	
	
}
