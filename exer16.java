import java.util.TreeSet;

public class exer16 {
    public static void main(String[] args) {
    
    TreeSet<String> nomes = new TreeSet<>();
   
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Lucas");
        nomes.add("Ana");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
