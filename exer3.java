import java.util.Scanner;
import java.util.Random;

public class exer3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Random random = new Random();
        int i = 0;
        
        int numrand = random.nextInt(100) + 1;
        
		int numadv = 0;
		
		while (numadv != numrand) {
        	System.out.print("Digite um número: ");
            numadv = leitor.nextInt();
            i = i +1;
        	if (numadv < numrand) {
        		System.out.println("Muito baixo");
        	}else if (numadv > numrand) {
        		System.out.println("Muito alto");
        	}else {
        		System.out.println("VOCÊ ACERTOU UHULLLL");
        	}
        }
        
		System.out.printf("Você levou: %s tentativas%n", i);
		
        leitor.close(); 
    }
}