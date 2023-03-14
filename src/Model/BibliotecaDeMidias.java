package Model;

import com.sun.source.tree.ReturnTree;

import java.util.ArrayList;
// -----------------------------------Atributo Classe Biblioteca de Midias-------------------------------- //
public class BibliotecaDeMidias {
    private ArrayList<Midia> midias;
    private Usuario usuario;
    private Playlist playlist;

    // -----------------------------------Constructor-------------------------------------------------- //
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

    //----------------------------------Metodo tocar play list-----------------------------//
    public void tocar_playlist_music(){


        System.out.println(midias);
        System.out.println(midias.size());

        System.out.println("\n  Minha playlist musica  \n");
    //----------utilizando metodo que inicia na posição 0 e percorre osdados que são < que 0 //
        for (int i = 0; i < midias.size(); i++) {
            System.out.println("playlist: " + midias.get(i));

        }
        System.out.println("Musica tocando");
//-------------------Retorna posição atual------------------------------------------------- //
        System.out.println(this.playlist.getMidia_atual());



    }



}
