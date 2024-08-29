package org.example;


import java.time.LocalDateTime;

public class NodeP {
    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private NodeP proximo;

    public NodeP()
    {
        this.id = null;
        this.proximo = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public NodeP getProximo() {
        return proximo;
    }


    public void setProximo(NodeP proximo) {
        this.proximo = proximo;
    }

    public void setInformacao(int id, LocalDateTime data, String descricao){
        this.id = id;
        this.data = data;
        this.descricao = descricao;
    }

    public void getInformacao(){
        System.out.println("Id:"+this.id);
        System.out.println("Data:"+this.data);
        System.out.println("Descrição:"+this.descricao);
    }


}
