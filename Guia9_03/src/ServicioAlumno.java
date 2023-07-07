import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
Se pide toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

 */
public class ServicioAlumno {


    List<Integer> notas = new ArrayList<>(); //instanciar Lista de notas de la clase Alumno
    List<Alumno> listaAlumnos; //Atributo de la clase
    public ServicioAlumno() //Constructor con el atributo de la Clase
    {
        listaAlumnos = new ArrayList<>();
    }

    public void crearAlumno() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = leer.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            int nota = leer.nextInt();
            notas.add(nota);
        }
        Alumno alumno = new Alumno(nombre, notas);
        listaAlumnos.add(alumno);
        crearVariosAlumnos(leer, alumno);

    }

    private void crearVariosAlumnos(Scanner leer, Alumno alumno) {
        System.out.print("¿Desea crear otro alumno? (s/n): ");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("s")) {
            crearAlumno();
        }
        System.out.println(alumno.toString());
    }

    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
     */
    public void notaFinal(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombre = leer.nextLine();

        Iterator<Alumno> iterador = listaAlumnos.iterator();

        while(iterador.hasNext()){
            Alumno alumno = iterador.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)){
                List<Integer> notas = alumno.getNotas();
                int suma =0;
                for (int i = 0; i < notas.size(); i++) {
                    suma = suma + notas.get(i);
                }
                double promedio = suma/notas.size();
                System.out.println("El promedio es: "+promedio);
                break;
            }
        }
    }


}
