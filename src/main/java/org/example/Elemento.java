package org.example;

import java.time.LocalDateTime;

public class Elemento {
    private String id;
    private String descricao;
    private String nome;

    public Elemento(String id, String descricao, String nome){
        this.id = id;
        this.descricao = descricao;
        this.nome= nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
