package Model;

import java.util.Arrays;

// -----------------------------------Atributo Classe Filme-------------------------------- //
public class Filme extends Midia {
    private double duracao;
    private String tipo;
    private String[] elenco;
    private String diretor;
    private String Produtor;
    // -----------------------------------Construtor-------------------------------- //
    public Filme(String titulo, String ano, String genero, double duracao, String tipo, String[] elenco, String diretor, String produtor) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.tipo = tipo;
        this.elenco = elenco;
        this.diretor = diretor;
        Produtor = produtor;
    }

    public double getDuracao() {
        if(this.duracao>120){
            this.tipo="Longa";
        }else{
            this.tipo= "Curta";
        }
        return duracao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "duracao=" + duracao +
                ", tipo='" + tipo + '\'' +
                ", elenco=" + Arrays.toString(elenco) +
                ", diretor='" + diretor + '\'' +
                ", Produtor='" + Produtor + '\'' +
                '}';
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

