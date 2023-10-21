package service;

import model.Recurso;

public interface Autenticavel {
    public Autenticavel ou(Autenticavel proximo);

    public boolean autenticar();

    public String autenticacao();
}
