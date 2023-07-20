import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

}
