class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
    }

    public boolean disparo(RevolverAgua r) {
        if (r.mojar()) {
            this.mojado = true;
            return true;
        } else {
            r.siguienteChorro();
            return false;
        }
    }

    @Override
    public String toString() {
        return this.nombre + (this.mojado ? " (Mojado)" : " (Seco)");
    }
}


