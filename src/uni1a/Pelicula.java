package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;                 // (ya existía)
    // === NUEVO: relación con Actor (agregación) ===
    private final List<Actor> actores = new ArrayList<>();

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() { return estudio; }
    public void setEstudio(String estudio) { this.estudio = estudio; }

    // ---- Métodos relación Actor ----
    public void agregarActor(Actor actor) {
        if (actor != null) actores.add(actor);
    }
    public List<Actor> getActores() { return actores; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID:  " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        // Línea adicional NO intrusiva
        if (!actores.isEmpty()) System.out.println("Elenco: " + actores);
        System.out.println();
    }
}
