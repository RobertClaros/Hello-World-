import java.util.*;

public class OperacionesArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numerosArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        ingresarNumeros(numerosArray, scanner);
        int sum = sumaValores(numerosArray);
        mostrarOperacionesArrayLists(numerosArray, sum);

    }

    private static void mostrarOperacionesArrayLists(ArrayList<Integer> numerosArray, int sum) {
        System.out.println("La cantidad de valores ingresados es: "+ numerosArray.size());
        System.out.println("La suma de los valores ingresados es: "+ sum);
        System.out.println("El promedio de los valores ingresados es: "+(sum / numerosArray.size()));
    }

    private static int sumaValores(ArrayList<Integer> numerosArray) {
        int sum = 0;
        for (Integer num : numerosArray){
            sum = sum+num;
        }
        return sum;
    }

    private static void ingresarNumeros(ArrayList<Integer> numerosArray, Scanner scanner) {
        System.out.println("Ingrese numeros enteros excepto el -99 ");
        int numero = scanner.nextInt();
        while(numero != -99){
            numerosArray.add(numero);
            numero = scanner.nextInt();
        }
    }
}
