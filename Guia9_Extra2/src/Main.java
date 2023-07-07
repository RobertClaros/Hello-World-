import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<CantanteFamoso> cantantes = new ArrayList<>();
        cantantes.add(new CantanteFamoso("Daddy Yanque","La Gasolina"));
        cantantes.add(new CantanteFamoso("Juan Luis Guerra","Bachata Rosa"));
        cantantes.add(new CantanteFamoso("Queen","Bohemian Rapsody"));
        cantantes.add(new CantanteFamoso("Metallica","Master of Puppets"));
        cantantes.add(new CantanteFamoso("Los redonditos","Los redonditos de ricota" ));

        int opcion = 0;
        do{
            System.out.println("1. Agregar Cantante ");
            System.out.println("2. Mostrar todos los cantantes ");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir ");
            System.out.println("Elija una opcion ");
            opcion= scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del cantante: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el disco mas vendido del cantante: ");
                    String disco = scanner.nextLine();
                    cantantes.add(new CantanteFamoso(nombre,disco));
                    System.out.println("Cantante agregado satisfactoriamente");
                    break;
                case 2:
                    for (CantanteFamoso artista : cantantes) {
                        System.out.println(artista.toString());
                    }
                    break;
                case 3:
                    System.out.println(" Ingrese el cantante que dese eliminar ");
                    String nombreCantante = scanner.nextLine();
                    cantantes.removeIf(artista -> artista.getNombre().equals(nombreCantante));

                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion invalida");



            }

        }while(opcion !=4);
        System.out.println(" La lista de Cantantes es: ");
        for (CantanteFamoso cantante : cantantes){
            System.out.println(cantante.toString());
        }



    }
}
