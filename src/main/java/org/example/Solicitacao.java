package org.example;

import java.util.Date;

public class Solicitacao {

    private int id;
    private String descricao;
    private Date data;
    private DateTime hora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public DateTime getHora() {
        return hora;
    }

    public void setHora(DateTime hora) {
        this.hora = hora;
    }
}
