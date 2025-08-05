import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {

    	Scanner leitor = new Scanner(System.in);
    	
    	System.out.print("Quantos números terá o array? ");
        int tamanho = leitor.nextInt();
        int[] numeros = new int[tamanho];

   
        System.out.printf("Digite %d números: ", tamanho);
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = leitor.nextInt();
        }
        
        int somaImpares = 0;
        // aqui funciona na forma para cada numero no array numeros tlgd
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                somaImpares += numero;
            }
        }

        System.out.println("A soma dos números ímpares é: " + somaImpares);

        leitor.close();
    	
    }
}