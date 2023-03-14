package Model;

import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;

public class BibliotecaDeMidias {
    private ArrayList<Midia> midias;
    private Usuario usuario;
    private Playlist playlist;

    public BibliotecaDeMidias(ArrayList<Midia> midias, Usuario usuario) {
        this.midias = midias;
        this.usuario = usuario;
        this.playlist = new Playlist(midias,true);
    }

    @Override
    public String toString() {
        return "BibliotecaDeMidias{" +
                "midias=" + midias +
                ", usuario=" + usuario +
                ", playlist=" + playlist +
                '}';
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public void setMidias(ArrayList<Midia> midias) {
        this.midias = midias;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
    public void tocar_playlist_music(){


        System.out.println(midias);
        System.out.println(midias.size());

        System.out.println("\n  Minha playlist musica  \n");
        for (int i = 0; i < midias.size(); i++) {
            System.out.println("playlist: " + midias.get(i));

        }
        System.out.println("Musica tocando");

        System.out.println(this.playlist.getMidia_atual());



    }



}
