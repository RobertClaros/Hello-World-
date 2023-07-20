public class CineAPP {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Guardianes de la Galxia", 120, 12, "Director X");
        Cine cine = new Cine(pelicula, 8, 6, 10.0);
        System.out.println(pelicula.toString());
        System.out.println(cine.toString());

        System.out.println("Asientos vacios marcados con x ");
        cine.initSala();
        cine.mostrarSala();

        for (int i = 0; i <= 12; i++) {
            Espectador espectador = new Espectador("Espectador" + i, 18 + i, 8 + i);
            cine.ubicarEspectador(espectador);
        }
        System.out.println("Asientos ocupados marcados con 0");
        cine.mostrarSala();
    }
}
