public class Perro {
    String nombre;
    String raza;
    String edad;
    String tamaño;

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad='" + edad + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }

    public Perro(String nombre, String raza, String edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;

    }
}
