import java.util.LinkedHashSet;

public class exer15 {
    public static void main(String[] args) {

        LinkedHashSet<String> DiasSemana = new LinkedHashSet<>();

        DiasSemana.add("Quinta");
        DiasSemana.add("Domingo");
        DiasSemana.add("Sábado");
        DiasSemana.add("Terça");
        DiasSemana.add("Quarta");
        DiasSemana.add("Segunda");
        DiasSemana.add("Sexta");

        for (String dia : DiasSemana) {
            System.out.println(dia);
        }
    }
}
