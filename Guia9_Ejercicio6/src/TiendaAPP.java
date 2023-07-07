
import java.util.Scanner;

public class TiendaAPP {
    public static void main(String[] args) {
        ServicioProducto servicioProducto = new ServicioProducto();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    servicioProducto.agregarProducto(scanner);
                    break;
                case 2:
                    servicioProducto.modificarPrecio(scanner);
                    break;
                case 3:
                    servicioProducto.eliminarProducto(scanner);
                    break;
                case 4:
                    servicioProducto.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println();
        } while (opcion != 5);

        scanner.close();
    }
}