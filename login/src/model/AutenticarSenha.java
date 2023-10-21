package model;

public class AutenticarSenha extends Usuario {

    public AutenticarSenha(Usuario usuario, String senha) {
        
    }

    public boolean autenticar(Usuario usuario, String senha) {
        return !usuario.getSenha().equals(senha);
    }

    @Override
    public String autenticacao() {
        return "Senha inválida";
    }

}
