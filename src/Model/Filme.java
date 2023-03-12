package Model;

public class Filme extends Midia {
    private double duracao;
    private String tipo;
    private String[] elenco;
    private String diretor;
    private String Produtor;

    public Filme(String titulo, int ano, String genero, double duracao, String[] elenco, String diretor, String produtor) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.elenco = elenco;
        this.diretor = diretor;
        Produtor = produtor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return Produtor;
    }

    public void setProdutor(String produtor) {
        Produtor = produtor;
    }
}

