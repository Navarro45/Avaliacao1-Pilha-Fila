package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila f = new Fila();
        Pilha p = new Pilha();

        int id;
        LocalDateTime data;
        String descricao;


        boolean loop = true;
        while (loop){

            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite 1 para Inserir um cliente na Fila");
            System.out.println("Digite 2 para Retirar um cliente da Fila");
            System.out.println("Digite 3 para Imprimir a Fila");
            System.out.println("Digite 4 para Imprimir o historico de solicitacao");
            System.out.println("Digite 5 para Inserir uma solicitacao no historico");
            System.out.println("Digite 6 para Retirar uma solicitacao do historico");
            System.out.println("Digite 0 para Encerrar");
            int escolha = entrada.nextInt();
            entrada.nextLine();

            switch(escolha){
                case 1:
                    f.Insere();
                    break;

                case 2:
                    f.Remove();
                    break;

                case 3:
                    f.Imprime();
                    break;

                case 4:
                    p.imprime();
                case 5:
                    System.out.println("Digite o id do Cliente: ");
                    id = scanner.nextInt();
                    descricao = scanner.nextLine();
                    data = LocalDateTime.now();
                    p.inserir(id,data,descricao);
                    break;
                case 6:
                    p.remover();
                    break;

                case 0:

                    loop = false;
                    break;

                default:
                    System.out.println("Digite uma opção valida!");
                    break;
            }

        }
    }

}
