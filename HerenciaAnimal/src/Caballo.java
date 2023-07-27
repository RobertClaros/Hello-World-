public class Caballo extends Animal{
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    public void alimentoAnimal(){
        System.out.println(nombre+ " es un caballo y se alimena de: "+alimento);
    }
}
