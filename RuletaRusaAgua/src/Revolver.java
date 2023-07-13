import java.util.Random;

class RevolverAgua {
    private int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
        this.posicionActual = 0;
        this.posicionAgua = new Random().nextInt(6) + 1;
    }

    public void llenarRevolver() {
        this.posicionActual = new Random().nextInt(6) + 1;
        this.posicionAgua = new Random().nextInt(6) + 1;
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {
        this.posicionActual = (this.posicionActual % 6) + 1;
    }

    @Override
    public String toString() {
        return "Revolver de Agua - Posición actual: " + this.posicionActual + " - Posición del agua: " + this.posicionAgua;
    }
}
