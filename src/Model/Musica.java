package Model;
// -----------------------------------Atributo Classe Musica extend Midia------------------------------- //
public class Musica extends Midia{
    private double duracao;
    private String artista;
    private int nota;

    // -----------------------------------Construtor---------------------------------------- //
    public Musica(String titulo, String ano, String genero, double duracao, String artista, int nota) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.artista = artista;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "duracao=" + duracao +
                ", artista='" + artista + '\'' +
                ", nota=" + nota +
                '}';
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
 
}
