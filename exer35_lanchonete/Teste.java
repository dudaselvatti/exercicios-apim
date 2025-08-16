package exer35_lanchonete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); // único Scanner
        System.out.println("==============================================");
        System.out.println("  Bem-vindo ao Sistema da Lanchonete Quase Tres Lanches  ");
        System.out.println("==============================================");

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = leitor.nextLine();
        Pedido pedido = new Pedido(nomeCliente, 0.10);

        int opcao = -1;
        while (opcao != 0) {
            exibirMenuPrincipal(nomeCliente);
            try {
                opcao = leitor.nextInt();
                leitor.nextLine();

                switch (opcao) {
                    case 1:
                        montarPedido(pedido, leitor); // passa Scanner
                        break;
                    case 2:
                        finalizarPedido(pedido, leitor); // passa Scanner
                        opcao = 0;
                        break;
                    case 3:
                        visualizarCardapio();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("\nOpcao invalida... Por favor, tente novamente com uma das opcoes acima");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nERRO SOMENTE NUMEROS SAO ACEITOS");
                leitor.nextLine();
            }
        }

        leitor.close(); // fecha apenas no final
        System.out.println("\nObrigado por usar nosso sistema!");
        System.out.println("Volte sempre na nossa lanchonete :)!");
    }

    private static void exibirMenuPrincipal(String nomeCliente) {
        System.out.println("\nOlá, " + nomeCliente + "! O que deseja fazer?");
        System.out.println("1 - Montar pedido");
        System.out.println("2 - Finalizar pedido");
        System.out.println("3 - Visualizar cardápio");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void montarPedido(Pedido pedido, Scanner leitor) {
        System.out.println("\n--- Montar Pedido ---");
        System.out.println("1 - Lanche");
        System.out.println("2 - Pizza");
        System.out.println("3 - Salgadinho");
        System.out.print("Escolha o tipo de prato: ");

        try {
            int tipoPrato = leitor.nextInt();
            leitor.nextLine();

            switch (tipoPrato) {
                case 1:
                    System.out.print("Escolha o pão (francês/de forma): ");
                    String pao = leitor.nextLine();

                    System.out.print("Escolha o recheio (carne/frango): ");
                    String recheio = leitor.nextLine();

                    System.out.print("Escolha o molho (maionese/ketchup): ");
                    String molho = leitor.nextLine();

                    Lanche lanche = new Lanche(pao, recheio, molho);
                    pedido.adicionarItem(lanche);
                    System.out.println("\nLanche adicionado com sucesso!");    
                    break;

                case 2:
                    System.out.print("Escolha o molho (branco/tomate): ");
                    String molhopizza = leitor.nextLine();

                    System.out.print("Escolha a borda (recheada/nao): ");
                    String borda = leitor.nextLine();

                    System.out.print("Escolha o sabor (carne/frango): ");
                    String sabor = leitor.nextLine();

                    Pizza pizza = new Pizza(molhopizza, borda, sabor);
                    pedido.adicionarItem(pizza);
                    System.out.println("\nPizza adicionada com sucesso!");
                    break;

                case 3:
                    System.out.print("Escolha a massa (trigo/milho): ");
                    String massasalg = leitor.nextLine();

                    System.out.print("Escolha o tipo (assado/frito): ");
                    String tipo = leitor.nextLine();

                    System.out.print("Escolha o recheio (carne/frango): ");
                    String recheiosalg = leitor.nextLine();

                    Salgadinho salgadinho = new Salgadinho(massasalg, tipo, recheiosalg);
                    pedido.adicionarItem(salgadinho);
                    System.out.println("\nSalgadinho adicionado com sucesso!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("\nERRO: Apenas números são aceitos.");
            leitor.nextLine();
        }
    }

    private static void finalizarPedido(Pedido pedido, Scanner leitor) {
        System.out.println("\n--- Finalizar Pedido ---");
        pedido.mostrarFatura();

        System.out.print("\nDigite o valor pago pelo cliente: ");
        try {
            double valorPago = leitor.nextDouble();
            leitor.nextLine();

            double troco = pedido.calcularTroco(valorPago);

            if (troco >= 0) {
                System.out.printf("Troco a ser devolvido: R$ %.2f\n", troco);
            } else {
                System.out.printf("Atencao! Faltam R$ %.2f pra completar o pagamento.\n", -troco);
            }
        } catch (InputMismatchException e) {
            System.out.println("\nErro: Valor de pagamento invalido.");
            leitor.nextLine();
        }
    }

    private static void visualizarCardapio() {
        System.out.println("\n--- Cardápio Especial da Quase Tres Lanches ---");
        System.out.println("Opcoes de Lanches: Carne, Frango");
        System.out.println("Opcoes de Pizza: Recheios de Carne e Frango, Bordas Recheadas");
        System.out.println("Opcoes de Salgadinhos: Fritos e Assados, de Carne e Frango");
        System.out.println("------------------------------------");
    }
}
