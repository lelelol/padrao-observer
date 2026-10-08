package org.example;

import java.util.Observable;

public class Canal extends Observable {

    private String nome;
    private String categoria;

    public Canal(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public void publicarVideo() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Canal{" +
                "nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
