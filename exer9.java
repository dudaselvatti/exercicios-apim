import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exer9 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        List<String> tarefas = new ArrayList<>();

        tarefas.add("Comprar leite");
        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");

        int x = -1;
        while (x != 0) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Listar tarefas pra ver o indice");
            System.out.println("2. Adicionar tarefa");
            System.out.println("3. Remover tarefa pelo índice");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            x = leitor.nextInt();

            switch (x) {
                case 1:
                    System.out.println("\nTarefas com indice:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ": " + tarefas.get(i));
                    }
                    break;

                case 2:
                    System.out.print("Digite a nova tarefa: ");
                    leitor.nextLine();
                    String novaTarefa = leitor.nextLine();
                    tarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada ta cheio de trabalho hein");
                    break;

                case 3:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int indice = leitor.nextInt();
                    if (indice >= 0 && indice < tarefas.size()) {
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida seu preguiçoso");
                    } else {
                        System.out.println("Índice inválido, escolha um correto");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        leitor.close();
    }
}
