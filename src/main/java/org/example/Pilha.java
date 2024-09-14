package org.example;

public class Pilha {
    private Node topo;

    public Pilha(){
        this.topo=null;
    }
    public void adicionarHistorico(Elemento solicitacao){
        Node no = new Node();
        no.setInformacao(solicitacao);
        if (this.topo==null){
            this.topo=no;
        }
        else {
            no.setProximo(this.topo);
            this.topo=no;
        }

    }
    public void imprimir(){
        System.out.println("-----Lista de Solicitação-----");
        Node atual=this.topo;
        while(atual!=null) {
            System.out.println("->" + "ID: "+ atual.getInformacao().getId() + " / "+ "Descrição: " + atual.getInformacao().getDescricao() + "/" + "Nome: " + atual.getInformacao().getNome());
            atual = atual.getProximo();
        }
    }
    public void removerHistorico(){
        this.topo=this.topo.getProximo();

    }


}
