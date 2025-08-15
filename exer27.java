import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class exer27 {
    public static void main(String[] args) {
        
        ArrayList<String> participantes = new ArrayList<>();
        
        participantes.add("Mary");
        participantes.add("John");
        participantes.add("Alice");
        participantes.add("Bob");
        participantes.add("Charlie");
        participantes.add("Emilly");
        participantes.add("Emilly");
        participantes.add("Emilly");
        participantes.add("Bob");
        participantes.add("Bob");

        HashSet <String> unicos = new HashSet<>(participantes);

        ArrayList<String> listaUnicos = new ArrayList<>(unicos);

        System.out.println("Sorteados: ");
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int indexlista = random.nextInt(listaUnicos.size());
            String sorteado = listaUnicos.get(indexlista);
            System.out.println(sorteado);
            listaUnicos.remove(indexlista);
        }
    }
}
