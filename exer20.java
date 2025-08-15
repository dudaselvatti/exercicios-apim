import java.util.Scanner;
import java.util.HashMap;

public class exer20 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();
        
        agenda.put("João", "1234-5678");
        agenda.put("Maria", "2345-6789");
        agenda.put("Pedro", "3456-7890");
        agenda.put("Ana", "4567-8901");

        int x = -1;


        while (x != 0){
    
            System.out.println("DISPONIBILIDADE:");
            System.out.println("\n1 - Consultar telefone");
            System.out.println("\n2 - Adicionar contato");
            System.out.println("\n3 - Listar contatos");
            System.out.println("\n0 - Sair");

            System.out.print("\nEscolha uma opção: ");
            x = leitor.nextInt();
            leitor.nextLine();

            switch (x) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = leitor.nextLine();
                    if (agenda.containsKey(nome)) {
                        System.out.println("Telefone de " + nome + ": " + agenda.get(nome));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do contato: ");
                    String novoNome = leitor.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String novoTelefone = leitor.nextLine();
                    agenda.put(novoNome, novoTelefone);
                    System.out.println("Contato adicionado.");
                    break;

                case 3:
                    System.out.println("Lista de contatos (nome e telefone):");
                    for (String contato : agenda.keySet()) {
                        System.out.println(contato + ": " + agenda.get(contato));
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            leitor.close();
        }
    }
}
