package uni1a;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;                 // (se mantiene tal cual)
    // === NUEVO: relación con Temporada (composición) ===
    private final List<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() { return temporadas; }
    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }

    // ---- Métodos relación Temporada ----
    public void agregarTemporada(Temporada temporada) {
        if (temporada != null) listaTemporadas.add(temporada);
    }
    public List<Temporada> getListaTemporadas() { return listaTemporadas; }

    public int getTotalEpisodios() {
        int total = 0;
        for (Temporada t : listaTemporadas) total += t.getCantidadEpisodios();
        return total;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:"); // (lo dejo como en tu base)
        System.out.println("ID:  " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + temporadas);
        // Líneas adicionales NO intrusivas
        if (!listaTemporadas.isEmpty()) {
            System.out.println("Temporadas cargadas (lista): " + listaTemporadas.size());
            System.out.println("Episodios totales: " + getTotalEpisodios());
        }
        System.out.println();
    }
}
