import java.util.LinkedHashMap;

public class exer21 {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, String> estoque = new LinkedHashMap<>();

        estoque.put(1, "Notebook");
        estoque.put(2, "Mouse");
        estoque.put(3, "Teclado");
        estoque.put(4, "Monitor");
        estoque.put(5, "Impressora");

        System.out.println("Itens no estoque:");
        for (Integer chave : estoque.keySet()) {
            System.out.println("Chave: " + chave + ", Valor: " + estoque.get(chave));
        }

    }
}
