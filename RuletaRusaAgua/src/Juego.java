import java.util.ArrayList;

class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void llenarJuego() {
        this.revolver.llenarRevolver();
    }

    public void ronda() {
        boolean mojado = false;

        for (int i = 0; i < jugadores.size() && !mojado; i++) {
            Jugador jugador = jugadores.get(i);
            mojado = jugador.disparo(revolver);
            System.out.println(jugador.toString());
        }
    }
}
