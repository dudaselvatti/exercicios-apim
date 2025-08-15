import java.util.HashMap;

public class exer19 {
    public static void main(String[] args) {

        String texto = "Java e uma linguagem de programacao. Java e popular. Programacao em Java e divertida.";

        HashMap<String, Integer> contador = new HashMap<>();

        for (String palavra : texto.split(" ")) {
            palavra = palavra.replaceAll("[^a-zA-Z]", "").toLowerCase();
            contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("Contagem de palavras:");
        for (String palavra : contador.keySet()) {
            System.out.println(palavra + ": " + contador.get(palavra));
        }
    }
}
