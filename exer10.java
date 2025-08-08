import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class exer10 {
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();

        Random aleatorio = new Random();

        for (int i = 0; i < 10; i++) {
            int numero = aleatorio.nextInt(100) + 1;
            numeros.add(numero);
        }

        System.out.println("Números gerados: " + numeros);

        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);

    }
    
}
