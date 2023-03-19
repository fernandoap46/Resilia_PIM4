package Model;

//---------------------------------Atributos Classe Artista------------------------------------------
public class Artista {
    private String nome;
    private String data_de_nascimento;
    //private Premiacao premiação;
    private String Genero;

    //---------------------------------Construtor-----------------------------------------------------
    public Artista(String nome, String data_de_nascimento, String genero) {
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;
        //this.premiação = premiação;
        Genero = genero;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nome='" + nome + '\'' +
                ", data_de_nascimento='" + data_de_nascimento + '\'' +
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

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
