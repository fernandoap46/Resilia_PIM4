package Model;

// -----------------------------------Classe usuario-------------------------------- //
public class Usuario {
    private String apelido;
    private String senha;

    // -----------------------------------Construtor-------------------------------- //
    public Usuario(String apelido, String senha) {
        this.apelido = apelido;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "apelido='" + apelido + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
