public class AdopcionAPP {
    /*
    1.
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.

     */
    public static void main (String[] args){

        Perro perro1 = new Perro("Bambi","Pastor Aleman","1","Grande");
        Perro perro2 = new Perro("Nose","Chihuahua","10","Chiquito");
        Perro perro3 = new Perro("Paul","Shnauzer","10","Mediano");
        Persona persona1 = new Persona("Yohan","Venturas", "28", "2340951" );
        Persona persona2 = new Persona("Vicky","Gamba", "15", "9613786");

        persona1.adoptarPerro(perro1);
        persona1.adoptarPerro(perro2);
        persona2.adoptarPerro(perro3);



        System.out.println("Lista de Adopciones");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }

}
