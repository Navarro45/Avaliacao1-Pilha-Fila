package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Pilha {
    private NodeP topo;

    public Pilha() {
        this.topo = null;
    }

    //Inserindo elementos
    public void inserir(int id, LocalDateTime data, String descricao) {
        //Declarando nosso novo nó
        NodeP no = new NodeP();

        no.setInformacao(id, data, descricao);
        if (topo == null) {
            topo = no;
        } else {
            //Aqui se cria um apontador para a topo.
            NodeP atual = topo;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(no);
        }
    }


    //Imprimindo elementos 
    public void imprime() {
        NodeP atual = topo;
        while (atual != null) {
            atual.getInformacao();
            System.out.print(" -- Proxima Solicitacao-- ");
            atual = atual.getProximo();
        }
        System.out.println("Acabou");


    }

    public void remover() {
        Scanner entrada = new Scanner(System.in);
        NodeP atual = topo;
        NodeP proximo = atual.getProximo();
        NodeP anterior;

        System.out.println("Digite o numero que deseja excluir:");
        int escolha = entrada.nextInt();
        entrada.nextLine();

        while (proximo != null) {
            if (escolha == proximo.getId()) {
                anterior = atual;
                proximo = proximo.getProximo();
                anterior.setProximo(proximo);
                break;
            }
            atual = proximo;
            proximo = proximo.getProximo();
        }
        if (proximo == null) {
            System.out.println("O indice digitado nao foi encontrado");
        }
    }
}