import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class exer13 {
    public static void main(String[] args) {
 
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(4); 
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(1);
        System.out.println("Números na lista: " + numeros);

        HashSet<Integer> numerosUnicos = new HashSet<>(numeros);
        System.out.println("Números únicos: " + numerosUnicos);

    }
}
