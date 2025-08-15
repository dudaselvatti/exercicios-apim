package exer29;

import java.util.Scanner;
import java.util.LinkedList;

public class Historico {

    LinkedList<String> historico = new LinkedList<>();
    int indice = -1;
    
    public void visitar(String url) {
        historico.add(url);
        indice++;
    }

    public void voltar() {
        if(indice > 0) {
            indice--;
            System.out.println("Voltando do atual para: " + historico.get(indice));
        } else {
            System.out.println("Nao existe pagina anterior.");
        }
        
    }

    public void avancar() {
        if(indice < historico.size() - 1) {
            indice++;
            System.out.println("Avancando do atual para: " + historico.get(indice));
        } else {
            System.out.println("Nao existe pagina posterior.");
        }
        
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Historico ordem = new Historico();
        String url;

        int opcao = -1;

        while(opcao != 0){
            System.out.println("0 - Sair");
            System.out.println("1 - Visitar nova URL");
            System.out.println("2 - Voltar");
            System.out.println("3 - Avancar");
            
            opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch(opcao) {
                case 1:
                    System.out.println("Digite uma URL para visitar:");
                    url = leitor.nextLine();
                    ordem.visitar(url);
                    break;
                case 2:
                    ordem.voltar();
                    break;
                case 3:
                    ordem.avancar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }

        leitor.close();
    }
    
}