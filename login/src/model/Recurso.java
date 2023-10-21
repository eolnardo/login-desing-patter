package model;

import service.Autenticavel;

public class Recurso implements Autenticavel {

    private String nome;
    private String perfilNecessario;
    private boolean ativo = true;

    public Recurso() {
    }

    public Recurso(String nome, String perfilNecessario, boolean ativo) {
        this.nome = nome;
        this.perfilNecessario = perfilNecessario;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfilNecessario() {
        return perfilNecessario;
    }

    public void setPerfilNecessario(String perfilNecessario) {
        this.perfilNecessario = perfilNecessario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public Autenticavel ou(Autenticavel proximo) {

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
