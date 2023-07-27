public class Perro extends Animal {


    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    public void alimentoAnimal(){
        System.out.println(nombre+ " es un perro y se alimena de: "+alimento);
    }
}
