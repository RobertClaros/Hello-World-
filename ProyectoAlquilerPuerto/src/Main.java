import models.Alquiler;
import models.BarcoMotor;
import models.Velero;
import models.Yate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Velero velero = new Velero("V123", 10.5, 2018, 2);
        BarcoMotor barcoMotor = new BarcoMotor("BM456", 12.0, 2020, 300);
        Yate yateLujo = new Yate("YL789", 18.5, 2019, 500, 4);


        LocalDate fechaAlquiler = LocalDate.of(2023, 8, 1);
        LocalDate fechaDevolucion = LocalDate.of(2023, 8, 7);

        Alquiler alquilerVelero = new Alquiler("Viky", "123456789", fechaAlquiler, fechaDevolucion, 1, velero);
        Alquiler alquilerBarcoMotor = new Alquiler("Albert", "987654321", fechaAlquiler, fechaDevolucion, 2, barcoMotor);
        Alquiler alquilerYateLujo = new Alquiler("Marcos", "456789123", fechaAlquiler, fechaDevolucion, 3, yateLujo);


        System.out.println("Precio alquiler Velero: " + alquilerVelero.calcularPrecioAlquiler());
        System.out.println("Precio alquiler Barco a Motor: " + alquilerBarcoMotor.calcularPrecioAlquiler());
        System.out.println("Precio alquiler Yate de Lujo: " + alquilerYateLujo.calcularPrecioAlquiler());
    }
}
