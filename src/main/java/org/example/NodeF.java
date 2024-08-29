package org.example;

public class NodeF {
    private Integer informacao;
    private NodeF proximo;
    private NodeF anterior;
    private Integer indice;

    public NodeF()
    {
        this.informacao = null;
        this.proximo = null;
    }

    public Integer getInformacao() {
        return informacao;
    }

    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }

    public NodeF getProximo() {
        return proximo;
    }

    public void setProximo(NodeF proximo) {
        this.proximo = proximo;
    }

    public NodeF getAnterior() {
        return anterior;
    }

    public void setAnterior(NodeF anterior) {
        this.anterior = anterior;
    }

    public Integer getIndice(){
        return indice;

    }

    public void setIndice(int indice){
        this.indice = indice;
    }

}
