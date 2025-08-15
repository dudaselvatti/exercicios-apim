import java.util.TreeMap;

public class exer22 {
    public static void main(String[] args) {
        
        TreeMap<String, Double> notas = new TreeMap<>();
        
        notas.put("Alice", 8.5);
        notas.put("Eve", 7.5); 
        notas.put("Bob", 7.0);
        notas.put("Diana", 6.8);
        notas.put("Charlie", 9.2);
        

        //fora de ordem alfabética

        System.out.println("Notas:");
        for (String aluno : notas.keySet()) {
            System.out.println(aluno + ": " + notas.get(aluno));
        }

    }
}
