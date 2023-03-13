package Model;

public class Playlist {
    private Midia midias;
    private String ordem_de_execucao;
    private String midia_atual;

    public Playlist(Midia midias, String ordem_de_execucao, String midia_atual) {
        this.midias = midias;
        this.ordem_de_execucao = ordem_de_execucao;
        this.midia_atual = midia_atual;
    }

    public Midia getMidias() {
        return midias;
    }

    public void setMidias(Midia midias) {
        this.midias = midias;
    }

    public String getOrdem_de_execucao() {
        return ordem_de_execucao;
    }

    public void setOrdem_de_execucao(String ordem_de_execucao) {
        this.ordem_de_execucao = ordem_de_execucao;
    }

    public String getMidia_atual() {
        return midia_atual;
    }

    public void setMidia_atual(String midia_atual) {
        this.midia_atual = midia_atual;
    }
}
