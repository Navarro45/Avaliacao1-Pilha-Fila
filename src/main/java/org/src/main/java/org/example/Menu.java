package org.example;
import java.util.Scanner;
public class Menu {
    private boolean ativo=true;
    private int escolha;
    private String id;
    private String descricao;
    private String nome;
    private String data;

    public void menu(){
        Elemento[] historico = new Elemento[]{
                new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"),
                new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
                new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
                new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00"),
                new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
                new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
                new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
                new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00"),
                new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30"),
                new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00")
        };
        Elemento[] filaAtendimento = new Elemento[] {
                new Elemento("CLI001", "Maria Silva", "Dúvida sobre produto"),
                new Elemento("CLI002", "João Souza", "Reclamação de serviço"),
                new Elemento("CLI003", "Ana Costa", "Solicitação de reembolso"),
                new Elemento("CLI004", "Pedro Alves", "Informações de entrega"),
                new Elemento("CLI005", "Carla Dias", "Agendamento de visita"),
                new Elemento("CLI006", "Lucas Martins", "Alteração de pedido"),
                new Elemento("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
                new Elemento("CLI008", "Rafael Lima", "Renovação de assinatura"),
                new Elemento("CLI009", "Fernanda Gomes", "Suporte para instalação"),
                new Elemento("CLI010", "Carlos Eduardo", "Pedido de orçamento")
        };
        Pilha p1 = new Pilha();
        Fila f1 = new Fila();
        int i = 0;
        try {
            while (true) {
                p1.adicionarHistorico(historico[i]);
                f1.adicionarCliente(filaAtendimento[i]);
                i++;  // Avança para o próximo índice
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        while(this.ativo) {
            System.out.println();
            System.out.println("-----MENU-----");
            System.out.println("6 - mostrar historico");
            System.out.println("5 - mostrar lista de atendimento");
            System.out.println("4 - adicionar Cliente");
            System.out.println("3 - atender Cliente");
            System.out.println("2 - adicionar Solicitação");
            System.out.println("1 - remover Solicitação");
            System.out.println("Qualquer outro valor para sair");
            System.out.print("Digite sua escolha: ");
            try {
                escolha = scanner.nextInt();
                String buffer = scanner.nextLine();
                System.out.println();
                switch (this.escolha) {
                    default:
                        this.ativo = false;
                        break;
                    case 1:
                        p1.removerHistorico();
                        p1.imprimir();
                        break;
                    case 2:
                        System.out.print("Digite o ID da solicitação: ");
                        this.id = scanner.nextLine();
                        System.out.print("Digite a descrição da solicitação: ");
                        this.descricao = scanner.nextLine();
                        System.out.print("Digite a data: ");
                        this.data = scanner.nextLine();
                        p1.adicionarHistorico(new Elemento(this.id, this.descricao, this.data));
                        p1.imprimir();
                        break;
                    case 3:
                        f1.atenderCliente();
                        f1.imprimirCliente();
                        break;
                    case 4:
                        System.out.print("Digite o ID do atendimento");
                        this.id = scanner.nextLine();
                        System.out.print("Digite a descrição do atendimento");
                        this.descricao = scanner.nextLine();
                        System.out.print("Digite o nome do Cliente: ");
                        this.nome = scanner.nextLine();
                        f1.adicionarCliente(new Elemento(this.id, this.descricao, this.nome));
                        f1.imprimirCliente();
                        break;
                    case 5:
                        f1.imprimirCliente();
                        break;
                    case 6:
                        p1.imprimir();
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Erro no input. Tente novamente");
                break;
            }
        }
    }

}
