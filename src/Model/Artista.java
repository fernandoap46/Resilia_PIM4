package Model;

public class Artista {
    private String nome;
    private String data_de_nascimento;
    private Premiacao premiação;
    private String Genero;

    public Artista(String nome, String data_de_nascimento, Premiacao premiação, String genero) {
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.premiação = premiação;
        Genero = genero;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                ", data_de_nascimento='" + data_de_nascimento + '\'' +
                ", premiação=" + premiação +
                ", Genero='" + Genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(String data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public Premiacao getPremiação() {
        return premiação;
    }

    public void setPremiação(Premiacao premiação) {
        this.premiação = premiação;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
