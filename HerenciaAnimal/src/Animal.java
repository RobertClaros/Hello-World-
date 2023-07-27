public class Animal {
    String nombre;
    String alimento;
    int edad;
    String raza;

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    public void alimentoAnimal(){
        System.out.println(nombre+" se alimenta de: "+ alimento);
    }
}
