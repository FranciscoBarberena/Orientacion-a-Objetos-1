package ar.ejercicio30;

public class CuadroTarifario {
    
    private double costoLocalBase;
    private double interurbanoMenor100;
    private double interurbanoHasta500;
    private double interurbanoMayor500;
    private double costoInternacionalHasta1Kg;
    private double costoInternacionalMayor1Kg;
    private double recargoRapidoLocal;
    private double recargoRapidoInternacional;
    
    
    public CuadroTarifario(double costoLocalBase, double interurbanoMenor100, 
                           double interurbanoHasta500, double interurbanoMayor500, 
                           double costoInternacionalHasta1Kg, double costoInternacionalMayor1Kg, double recargoRapidoLocal, double recargoRapidoInternacional) {
        this.costoLocalBase = costoLocalBase;
        this.interurbanoMenor100 = interurbanoMenor100;
        this.interurbanoHasta500 = interurbanoHasta500;
        this.interurbanoMayor500 = interurbanoMayor500;
        this.costoInternacionalHasta1Kg = costoInternacionalHasta1Kg;
        this.costoInternacionalMayor1Kg = costoInternacionalMayor1Kg;
        this.recargoRapidoLocal = recargoRapidoLocal;
        this.recargoRapidoInternacional = recargoRapidoInternacional;
    }


    public double calcularCostoInterurbano(double distanciaKm, double pesoGramos) {
        if (distanciaKm < 100) return this.interurbanoMenor100 * pesoGramos;
        if (distanciaKm <= 500) return this.interurbanoHasta500 * pesoGramos;
        return this.interurbanoMayor500 * pesoGramos;
    }
    
    // Envio rapido?????


}