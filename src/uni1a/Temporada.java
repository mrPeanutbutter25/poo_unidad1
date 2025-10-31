package uni1a;

public class Temporada {
    private int numero;
    private int cantidadEpisodios;
    private int anioEstreno;

    public Temporada(int numero, int cantidadEpisodios, int anioEstreno) {
        if (numero <= 0) throw new IllegalArgumentException("El número de temporada debe ser > 0");
        if (cantidadEpisodios < 0) throw new IllegalArgumentException("Episodios no puede ser negativo");
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
        this.anioEstreno = anioEstreno;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getCantidadEpisodios() { return cantidadEpisodios; }
    public void setCantidadEpisodios(int cantidadEpisodios) { this.cantidadEpisodios = cantidadEpisodios; }

    public int getAnioEstreno() { return anioEstreno; }
    public void setAnioEstreno(int anioEstreno) { this.anioEstreno = anioEstreno; }

    @Override
    public String toString() {
        return "T" + numero + " (" + cantidadEpisodios + " ep., " + anioEstreno + ")";
    }
}
