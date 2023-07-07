public class Main {
    /*
    3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.

     */
    public static void main(String[] args) {
        ServicioAlumno servicio = new ServicioAlumno();

        servicio.crearAlumno();
        servicio.notaFinal();
    }
}