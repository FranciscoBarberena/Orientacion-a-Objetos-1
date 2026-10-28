package ar.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestReporteDeConstruccion {
	
	private ReporteDeConstruccion reporte;
	
	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		
	}
	@Test
	void testVolumenDeMaterial() {
		assertEquals(0, reporte.volumenDeMaterial("Hierro"));
		Pieza esfera = new PiezaEsferica("Bronce","Negro",5);
		reporte.agregarPieza(esfera);
		assertEquals(0, reporte.volumenDeMaterial("Hierro"));
		assertEquals(esfera.calcularVolumen(), reporte.volumenDeMaterial("Bronce"));
		Pieza esfera2 = new PiezaEsferica("Bronce","Marrón",10);
		reporte.agregarPieza(esfera2);
		double volumenEsperado = esfera2.calcularVolumen() + esfera.calcularVolumen();
		assertEquals(volumenEsperado, reporte.volumenDeMaterial("Bronce"));
	}
	@Test
	void testSuperficieDeColor() {
		assertEquals(0, reporte.superficieDeColor("Negro"));
		Pieza esfera = new PiezaEsferica("Bronce","Marrón",5);
		reporte.agregarPieza(esfera);
		assertEquals(0, reporte.superficieDeColor("Negro"));
		assertEquals(esfera.calcularSuperficie(), reporte.superficieDeColor("Marrón"));
		Pieza esfera2 = new PiezaEsferica("Bronce","Marrón",10);
		reporte.agregarPieza(esfera2);
		double superficieEsperada = esfera2.calcularSuperficie() + esfera.calcularSuperficie();
		assertEquals(superficieEsperada, reporte.superficieDeColor("Marrón"));
	}
}
