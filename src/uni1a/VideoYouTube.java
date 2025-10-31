package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int likes;
    private int reproducciones;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero,
                        String canal, int likes, int reproducciones) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.likes = likes;
        this.reproducciones = reproducciones;
    }

    public String getCanal() { return canal; }
    public void setCanal(String canal) { this.canal = canal; }

    public int getLikes() { return likes; }
    public void setLikes(int likes) { this.likes = likes; }

    public int getReproducciones() { return reproducciones; }
    public void setReproducciones(int reproducciones) { this.reproducciones = reproducciones; }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("Likes: " + likes);
        System.out.println("Reproducciones: " + reproducciones);
        System.out.println();
    }
}
