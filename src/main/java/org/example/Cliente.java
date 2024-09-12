package org.example;

import java.util.Date;

public class Cliente {
    private String nome;
    private int id;
    private Date data;
    private DateTime hora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
