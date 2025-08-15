import java.util.ArrayDeque;
import java.util.Scanner;

public class exer25 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        ArrayDeque<String> pilha = new ArrayDeque<>();

        System.out.print("Empilhe agora os seus 3 livros favoritos :)) :");
        for (int i = 0; i < 3; i++){
            System.out.print("\nDigite o nome do livro " + (i + 1) + ": ");
            String livro = leitor.nextLine();
            pilha.push(livro);
        }

        System.out.print("\nLivros empilhados:");
        for (String livro : pilha) {
            System.out.print("\n" + livro);
        }

        System.out.print("\n\nDesempilhando um livro...\n");
        pilha.pop();

        System.out.print("Espiando o topo da pilha: " + pilha.peek() + "\n");

        leitor.close();
    }
}
