package Model;

public class Ator extends Artista {
    String formacao;

    public Ator(String nome, String data_de_nascimento, Premiacao premiação, String genero, String formacao) {
        super(nome, data_de_nascimento, premiação, genero);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
