package model;

import service.Autenticavel;

public class Usuario implements Autenticavel {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String perfil;

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public Autenticavel ou(Autenticavel proximo) {
        if (autenticar()) return this;
        return proximo;
    }

    @Override
    public boolean autenticar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticar'");
    }

    @Override
    public String autenticacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'autenticacao'");
    }

    

    

}
