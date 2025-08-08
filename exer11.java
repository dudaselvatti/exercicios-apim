import java.util.LinkedList;
import java.util.List;

public class exer11 {
    public static void main(String[] args) {
        
        List<String> fila = new LinkedList<>();

        fila.addLast("Ana");
        fila.addLast("Bruno");
        fila.addLast("Carlos");
        fila.addLast("Diana");
        fila.addLast("Eduardo");

        System.out.println("Fila inicial: " + fila);

        //aí atende os dois primeiros da fila
        fila.removeFirst();
        fila.removeFirst();

        System.out.println("Fila após atender os dois primeiros: " + fila);

        //agora a gente adiciona dois prioritários

        fila.addFirst("Fábio");
        fila.addFirst("Gisele");

        System.out.println("Fila após adicionar dois prioritários: " + fila);


    }
}
