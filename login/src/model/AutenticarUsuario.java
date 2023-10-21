package model;

public class AutenticarUsuario extends Usuario{
    public boolean autenticar(Usuario usuario, Recurso recurso) {
        return !usuario.getPerfil().equals(recurso.getPerfilNecessario());
    }

    public String autenticacao(Recurso recurso) {
        return "Acesso negado ao recurso " + recurso.getNome();
    }
}
