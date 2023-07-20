import java.util.Arrays;
import java.util.Random;

public class Cine {
    private Pelicula pelicula;
    private char[][] sala;
    private int filas;
    private int columnas;
    private double precioEntrada;

    public Cine(Pelicula pelicula, int filas, int columnas, double precioEntrada) {
        this.pelicula = pelicula;
        this.filas = filas;
        this.columnas = columnas;
        this.precioEntrada = precioEntrada;
        this.sala = new char[filas][columnas];
        initSala();
    }

    public void initSala() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = 'x';
            }
        }
    }

    public void ubicarEspectador(Espectador espectador) {
        Random random = new Random();
        int fila, columna;

        do {
            fila = random.nextInt(filas);
            columna = random.nextInt(columnas);
        } while (sala[fila][columna] == 'X');

        if (espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precioEntrada) {
            sala[fila][columna] = '0';
        }
    }

    public void mostrarSala() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(sala[i][j]+" ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Cine{" +
                "pelicula=" + pelicula +
                ", filas=" + filas +
                ", columnas=" + columnas +
                ", precioEntrada=" + precioEntrada +
                '}';
    }
}