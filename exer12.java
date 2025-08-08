import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        List<String> cidades = new ArrayList<>();

        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Barra Mansa");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        cidades.add("Osasco");
        cidades.add("Campinas");
        cidades.add("Brasília");
        cidades.add("Porto Alegre");
        cidades.add("Manaus");
        cidades.add("Recife");
        cidades.add("Belém");
        cidades.add("Goiânia");
        cidades.add("Guarulhos");


        System.out.println("Digite o nome de uma cidade:");

        String cidade = leitor.nextLine();

        if(cidades.contains(cidade)){
            System.out.println("A cidade " + cidade + " está na lista na posição " + cidades.indexOf(cidade));
        }else{
            System.out.println("A cidade " + cidade + " não está na lista, sinto muito");
        }
        
        leitor.close();

    }
}
