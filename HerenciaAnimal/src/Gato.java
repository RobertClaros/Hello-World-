public class Gato extends Animal{
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    public void alimentoAnimal(){
        System.out.println(nombre+ " es un gato y se alimena de: "+alimento);
    }
}
