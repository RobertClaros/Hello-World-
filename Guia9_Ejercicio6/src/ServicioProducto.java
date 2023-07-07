import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioProducto {
    private Map<String, Producto> productos;

    public ServicioProducto() {
        productos = new HashMap<>();
    }

    public void agregarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        Producto producto = new Producto(nombre, precio);
        productos.put(nombre, producto);

        System.out.println("Producto agregado con éxito.");
    }


    public void modificarPrecio(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {
            System.out.print("Ingrese el nuevo precio del producto: ");
            double nuevoPrecio = scanner.nextDouble();
            scanner.nextLine();
            Producto producto = productos.get(nombre);
            producto.setPrecio(nuevoPrecio);

            System.out.println("Precio modificado con éxito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado ");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarProductos() {
        System.out.println("----- Productos -----");
        for (Producto producto : productos.values()) {
            System.out.println(producto);
        }
    }
}