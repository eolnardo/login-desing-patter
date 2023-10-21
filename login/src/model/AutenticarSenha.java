package model;

public class AutenticarSenha extends Usuario {

    public boolean autenticar(Usuario usuario, String senha) {
        return !usuario.getSenha().equals(senha);
    }

    @Override
    public String autenticacao() {
        return "Senha inválida";
    }

}
