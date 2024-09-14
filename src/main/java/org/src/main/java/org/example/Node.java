package org.example;

public class Node {
    private Elemento informacao;
    private Node proximo;

    public Node(){
        this.informacao=null;
        this.proximo=null;
    }

    public Elemento getInformacao() {
        return informacao;
    }

    public void setInformacao(Elemento informacao) {
        this.informacao = informacao;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}

