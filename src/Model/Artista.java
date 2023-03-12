package Model;

public class Artista {
    String nome;
    String data_de_nascimento;
    Premiação premiação;
    String Genero;

    public Artista(String nome, String data_de_nascimento, Premiação premiação, String genero) {
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        this.premiação = premiação;
        Genero = genero;
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

    public Premiação getPremiação() {
        return premiação;
    }

    public void setPremiação(Premiação premiação) {
        this.premiação = premiação;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
