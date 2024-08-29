package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Pilha {
    private NodeP topo ;
    public Pilha(){
        this.topo = null;
    }

    //Inserindo elementos
    public void inserir (int id, LocalDateTime data, String descricao){
        //Declarando nosso novo nó
        NodeP no = new NodeP();

        no.setInformacao(id, data,descricao);
        if(topo == null){
            topo=no;
        }
        else{
            //Aqui se cria um apontador para a topo.
            NodeP atual =topo;
            while(atual.getProximo()!=null){
                atual = atual.getProximo();
            }
            atual.setProximo(no);
        }
    }


    //Imprimindo elementos 
    public void imprime(){
        NodeP atual = topo;
        while (atual != null) {
            atual.getInformacao();
            System.out.print(" -- Proxima Solicitacao-- ");
            atual= atual.getProximo();
        }
        System.out.println("Acabou");


    }

    public void remover(){
        Scanner entrada = new Scanner(System.in);
        NodeP atual = topo;
        NodeP proximo = atual.getProximo();
        NodeP anterior;

        System.out.println("Digite o numero que deseja excluir:");
        int escolha = entrada.nextInt();
        entrada.nextLine();

        while (proximo != null) {
            if(escolha == proximo.getId()){
                anterior = atual;
                proximo = proximo.getProximo();
                anterior.setProximo(proximo);
                break;
            }
            atual = proximo;
            proximo= proximo.getProximo();
        }
        if (proximo == null){
            System.out.println("O indice digitado nao foi encontrado");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha topo = new Pilha();
        System.out.println("Digite os itens da pilha (digite o id '0' para parar):");
        int id;
        LocalDateTime data;
        String descricao;
        while (true) {
            System.out.println("Digite o id:");
            id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a descricao:");
            descricao = scanner.nextLine();
            data = LocalDateTime.now();
            topo.inserir(id,data,descricao);
            if(id == 0){
                break;
            }
        }
        System.out.println("Pilha:");
        topo.imprime();
        boolean loop = true;

        while (loop){

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite 1 para inserir");
            System.out.println("Digite 2 para Excluir");
            System.out.println("Digite 0 para Encerrar");
            int escolha = entrada.nextInt();
            entrada.nextLine();

            switch(escolha){
                case 1:
                    System.out.println("Digite o numero que deseja adicionar");
                    id = scanner.nextInt();
                    descricao = scanner.nextLine();
                    data = LocalDateTime.now();
                    topo.inserir(id,data,descricao);
                    break;
                case 2:
                    topo.remover();
                    break;

                case 0:
                    topo.imprime();
                    loop = false;
                    break;

                default:
                    System.out.println("Digite uma opção valida!");
                    break;
            }

        }
    }

}