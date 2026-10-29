package ar.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class JuanMartinezTest {
    private Usuario juan;
    private OrdenCompra ordenCompra;
    private OrdenServicio ordenServicio;

    @BeforeEach
    void setUp() {
        juan = new Usuario("Juan Martínez", "Larrea 5800, Mar del Plata");

        ordenCompra = new OrdenCompra(juan, LocalDate.now(), "Larrea 5800, Mar del Plata", 0.0);
        
        Producto panelSolar = new Producto("Panel solar", "Materiales reciclables", 35000.0, false);
        Producto compostera = new Producto("Compostera", "Plástico", 8000.0, true);
        
        ordenCompra.agregarProducto(panelSolar);
        ordenCompra.agregarProducto(compostera);
        juan.agregarOrden(ordenCompra);

        ordenServicio = new OrdenServicio(
            juan, 
            LocalDate.now(), 
            "Larrea 5800, Mar del Plata", 
            5, 
            "instalación de calefón solar"
        );
        
        Producto calefonSolar = new Producto("Calefón solar", "Materiales reciclables", 50000.0, false);
        Tecnico lucia = new Tecnico("Lucía Iraola", "Instalaciones solares", 4500.0);
        
        ordenServicio.agregarProducto(calefonSolar);
        ordenServicio.agregarTecnico(lucia);
        juan.agregarOrden(ordenServicio);
    }

    @Test
    void testCostoOrdenCompra() {
        assertEquals(43000.0, ordenCompra.calcularCosto());
    }

    @Test
    void testCostoOrdenServicio() {
        assertEquals(72500.0, ordenServicio.calcularCosto());
    }
}
	

