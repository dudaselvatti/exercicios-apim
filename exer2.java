import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt(); 
        
        System.out.print("TABOADA DO TEU NUMERO HEIN%n");
        
        for (int i = 0; i < 11; i++) {
        	int resultado = i * numero;
        	System.out.printf("%d x %d = %d%n", i, numero, resultado);
        }

        leitor.close(); 
    }
}