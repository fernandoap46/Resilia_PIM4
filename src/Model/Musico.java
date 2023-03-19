package Model;

// -----------------------------------Atributo Classe Musico Extend Artista-------------------------------- //
public class Musico extends Artista{
    String atuacao;

    // -----------------------------------Construtor------------------------------------------ //


    public Musico(String nome, String data_de_nascimento, String genero, String atuacao) {
        super(nome, data_de_nascimento, genero);
        this.atuacao = atuacao;
    }

    @Override
    public String toString() {
        return "Musico{" +
                "atuacao='" + atuacao + '\'' +
                '}';
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
