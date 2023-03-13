package Model;

public class BibliotecaDeMidias {
    Midia midias;
    Usuario usuario;
    Playlist playlist;

    public BibliotecaDeMidias(Midia midias, Usuario usuario, Playlist playlist) {
        this.midias = midias;
        this.usuario = usuario;
        this.playlist = playlist;
    }

    public Midia getMidias() {
        return midias;
    }

    public void setMidias(Midia midias) {
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
}
