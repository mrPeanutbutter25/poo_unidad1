package uni1a;


public class Documental extends ContenidoAudiovisual {
    private String tema;                               // (ya existía)
    // === NUEVO: relación con Investigador (asociación 1–1) ===
    private Investigador investigadorPrincipal;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() { return tema; }
    public void setTema(String tema) { this.tema = tema; }

    // ---- Métodos relación Investigador ----
    public void setInvestigadorPrincipal(Investigador investigador) {
        this.investigadorPrincipal = investigador;
    }
    public Investigador getInvestigadorPrincipal() { return investigadorPrincipal; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID:  " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        // Línea adicional NO intrusiva
        if (investigadorPrincipal != null)
            System.out.println("Investigador: " + investigadorPrincipal);
        System.out.println();
    }
}
