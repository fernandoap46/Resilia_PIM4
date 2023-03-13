package Model;

public class Premiacao {
    private String premiacao;
    private int ano_premiacao;

    public Premiacao(String premiacao, int ano_premiacao) {
        this.premiacao = premiacao;
        this.ano_premiacao = ano_premiacao;
    }

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }

    public int getAno_premiacao() {
        return ano_premiacao;
    }

    public void setAno_premiacao(int ano_premiacao) {
        this.ano_premiacao = ano_premiacao;
    }
}
