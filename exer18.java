import java.util.Scanner;
import java.util.HashMap;


public class exer18 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        HashMap<String, String> traducao = new HashMap<>();

        traducao.put("Ola", "Hello");
        traducao.put("Mundo", "World");
        traducao.put("Java", "Java");
        traducao.put("Programacao", "Programming");
        traducao.put("Exercicio", "Exercise");


        System.out.println("Digite uma palavra em português:");
        String palavra = leitor.nextLine();

        if (traducao.containsKey(palavra)) {
            System.out.println("A tradução em inglês é: " + traducao.get(palavra));
        } else {
            System.out.println("Palavra não encontrada no dicionário.");
        }

        
        leitor.close();
    }
}
