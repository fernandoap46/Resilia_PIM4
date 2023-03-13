package Model;

public class Musico extends Artista{
    String atuacao;

    public Musico(String nome, String data_de_nascimento, Premiacao premiação, String genero, String atuacao) {
        super(nome, data_de_nascimento, premiação, genero);
        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
