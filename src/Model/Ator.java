package Model;

import java.util.ArrayList;

// -------------------------------------Atributo Classe Ator extend Artista-------------------------------- //
public class Ator extends Artista {
    String formacao;
    // -------------------------------------Construtor------------------------------------------------------ //


    public Ator(String nome, String data_de_nascimento, String genero, String formacao) {
        super(nome, data_de_nascimento, genero);
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "formacao='" + formacao + '\'' +
                '}';
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
