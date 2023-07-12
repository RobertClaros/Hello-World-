import java.util.ArrayList;
import java.util.List;

public class Persona {
    String nombre;
    String apellido;
    String edad;
    String docuemnto;
    List<Perro> perros;


    public Persona() {
    }

    public Persona(String nombre, String apellido, String edad, String docuemnto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.docuemnto = docuemnto;
        this.perros = new ArrayList<Perro>();
    }
    public void adoptarPerro(Perro perro){
        perros.add(perro);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' +
                ", docuemnto='" + docuemnto + '\'' +
                ", perros=" + perros.toString() +
                '}';
    }
}
