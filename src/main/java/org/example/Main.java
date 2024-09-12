package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
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
