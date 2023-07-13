import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador(1, "Yohan"));
        jugadores.add(new Jugador(2, "Robert"));
        jugadores.add(new Jugador(3, "Vicky"));
        jugadores.add(new Jugador(4, "Julian"));
        jugadores.add(new Jugador(5, "Marco"));
        jugadores.add(new Jugador(6, "Albert"));

        RevolverAgua revolver = new RevolverAgua();
        Juego juego = new Juego(jugadores, revolver);

        juego.llenarJuego();
        juego.ronda();
    }
}
