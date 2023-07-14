import java.util.ArrayList;

public class Juego {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();


        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        ArrayList<Carta> mano = baraja.darCartas(5);
        if (mano != null) {
            System.out.println("Cartas en la mano:");
            for (Carta carta : mano) {
                System.out.println(carta);
            }
        }

        System.out.println("Cartas en el montón:");
        ArrayList<Carta> monton = baraja.cartasMonton();
        if (monton != null) {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }

        System.out.println("Mostrar baraja:");
        baraja.mostrarBaraja();
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
    }
}
