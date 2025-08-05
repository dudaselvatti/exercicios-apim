import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble(); 

        System.out.print("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble(); 

        System.out.print("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        
        System.out.printf("A média é igual a: %.2f%n", media);
        
        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >=5 & media < 7){
            System.out.println("vem pro ifa vem");
        } else {
            System.out.println("reprovou");
        }

        leitor.close(); 
    }
}