import java.util.ArrayDeque;
import java.util.Scanner;

public class exer28 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        ArrayDeque<String> pilha = new ArrayDeque<>();

        System.out.print("Escreva uma frase para ser armazenada como pilha: ");
        String frase = leitor.nextLine();

        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            pilha.push(palavra);
        }

        System.out.print("\nPalavras empilhadas:");
        for (String palavra : pilha) {
            System.out.print("\n" + palavra);
        }

        System.out.print("\n\nFrase agora invertida:\n");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop() + " ");
        }

        leitor.close();
    }
}
