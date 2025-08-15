import java.util.HashMap;
import java.util.Scanner;

public class exer23 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Joao", "1234-5678");
        agenda.put("Maria", "2345-6789");
        agenda.put("Pedro", "3456-7890");
        agenda.put("Ana", "4567-8901");
        agenda.put("Lucas", "5678-9012");

        
        System.out.println("O que deseja verificar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Telefone");
        System.out.print("Escolha: ");
        int escolha = leitor.nextInt();
        leitor.nextLine();

        if(escolha == 1){
            System.out.print("Digite o nome que deseja verificar:");
            String nome = leitor.nextLine();
            if(agenda.containsKey(nome)){
                System.out.print("O nome " + nome + " está na agenda.");
            } else {
                System.out.print("O nome " + nome + " não está na agenda.");
            }
        } else if (escolha == 2){
            System.out.print("Digite o telefone que deseja verificar:");
            String telefone = leitor.nextLine();
            if(agenda.containsValue(telefone)){
                System.out.print("O telefone " + telefone + " está na agenda.");
            } else {
                System.out.print("O telefone " + telefone + " não está na agenda.");
            }
        } else {
            System.out.print("Opção inválida.");
        }

        leitor.close();
    }
    
}
