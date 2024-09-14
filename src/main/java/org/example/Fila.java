package org.example;

public class Fila {
    private Node frente;//ultimo elemento adicionado
    private Node tras;//primeiro elemento adicionado

    public Fila(){
        this.frente=null;
        this.tras=null;
    }
    public void adicionarCliente(Elemento cliente){
        Node no = new Node();
        no.setInformacao(cliente);
        if (this.tras==null){
            this.tras=no;
        }
        else{
            no.setProximo(this.frente);
        }
        this.frente=no;

    }
    public void imprimirCliente(){
        System.out.println("-----Lista de Atendimento-----");
        Node atual=this.frente;
        while(atual!=null) {
            System.out.println("->"+"ID: "+atual.getInformacao().getId() + " / "+ "Descrição: " + atual.getInformacao().getDescricao() + "/" + "Nome: " + atual.getInformacao().getNome());
            atual = atual.getProximo();
        }
    }
    public void atenderCliente(){
        Node atual=this.frente;
        while(atual.getProximo()!=this.tras){
            atual=atual.getProximo();
        }
        atual.setProximo(null);
        this.tras=atual;

    }

}
