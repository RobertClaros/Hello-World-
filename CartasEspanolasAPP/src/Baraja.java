import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;

    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();


        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (!cartas.isEmpty()) {
            Carta siguiente = cartas.remove(5);
            monton.add(siguiente);
            return siguiente;
        } else {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }

        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta siguiente = siguienteCarta();
            if (siguiente != null) {
                mano.add(siguiente);
            }
        }
        return mano;
    }

    public ArrayList<Carta> cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("Aún no ha salido ninguna carta.");
        }
        return monton;
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
