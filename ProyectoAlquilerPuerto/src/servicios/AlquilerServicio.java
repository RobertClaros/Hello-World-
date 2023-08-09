package servicios;

public class AlquilerServicio {
    public double calcularPrecioAlquiler() {
        long diasOcupacion = fechaDevolucion.toEpochDay() - fechaAlquiler.toEpochDay();
        double modulo = barco.calcularModulo();
        return diasOcupacion * modulo;
    }
}
