package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases principales
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        contenidos[3] = new VideoYouTube("Aprende Java", 15, "Educativo", "Programación con Bianchi", 1200, 50000);
        contenidos[4] = new Cortometraje("La Última Lluvia", 20, "Drama", "Ana Torres", 2024, "Festival de Cannes");

        // ===== RELACIONES ENTRE CLASES =====
        // Agregar actor a la película
        Pelicula pelicula = (Pelicula) contenidos[0];
        pelicula.agregarActor(new Actor("Sam Worthington", "Australia"));
        pelicula.agregarActor(new Actor("Zoe Saldaña", "Estados Unidos"));

        // Agregar temporada a la serie
        SerieDeTV serie = (SerieDeTV) contenidos[1];
        serie.agregarTemporada(new Temporada(1, 10, 2011));
        serie.agregarTemporada(new Temporada(2, 10, 2012));

        // Asignar investigador al documental
        Documental documental = (Documental) contenidos[2];
        documental.setInvestigadorPrincipal(new Investigador("Neil deGrasse Tyson", "Astrofísica", "NASA"));

        // ===== MOSTRAR DETALLES =====
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
