import java.util.*;

public class ServiciosPais {
    private List<Pais> listaPaises;

    public ServiciosPais() {
        listaPaises = new ArrayList<>();
        paisesCargados();
    }
    Scanner scanner = new Scanner(System.in);
    public void paisesCargados() {
        Pais pais1 = new Pais("Argentina");
        listaPaises.add(pais1);
        Pais pais2 = new Pais("Brasil");
        listaPaises.add(pais2);
        Pais pais3 = new Pais("Chile");
        listaPaises.add(pais3);
        Pais pais4 = new Pais("Uruguay");
        listaPaises.add(pais4);
        Pais pais5 = new Pais("Paraguay");
        listaPaises.add(pais5);

    }
    public void mostrarPaises() {
        System.out.println("Países guardados:");
        List<Pais> paisesOrdenados = new ArrayList<>(listaPaises);
        Collections.sort(paisesOrdenados, Comparator.comparing(Pais::getNombre));
        for (Pais pais : paisesOrdenados) {
            System.out.println(pais);
        }
    }

    public void eliminarPais() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del país a eliminar: ");
        String nombrePais = scanner.nextLine();

        Pais paisAEliminar = null;
        for (Pais pais : listaPaises) {
            if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                paisAEliminar = pais;
                break;
            }
        }

        if (paisAEliminar != null) {
            listaPaises.remove(paisAEliminar);
            System.out.println("El país '" + paisAEliminar + "' ha sido eliminado.");
        } else {
            System.out.println("El país '" + nombrePais + "' no se encuentra en la lista.");
        }
    }


}
