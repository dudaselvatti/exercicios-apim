package exer30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Aluno {

    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nome + " - Nota: " + nota;
    }


    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João", 7.5));
        alunos.add(new Aluno("Maria", 8.0));
        alunos.add(new Aluno("Pedro", 6.0));
        alunos.add(new Aluno("Ana", 5.5));
        alunos.add(new Aluno("Lucas", 9.0));
        alunos.add(new Aluno("Carla", 4.5));
        alunos.add(new Aluno("Fernanda", 8.5));
        alunos.add(new Aluno("Roberto", 3.0));
        alunos.add(new Aluno("Juliana", 6.5));

        Map<String, List<Aluno>> gruposdenota = new HashMap<>();

        gruposdenota.put("Aprovados", new ArrayList<>());
        gruposdenota.put("Reprovados", new ArrayList<>());
        gruposdenota.put("Recuperação", new ArrayList<>());

        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 7) {
                gruposdenota.get("Aprovados").add(aluno);
            } else if (aluno.getNota() >= 5) {
                gruposdenota.get("Recuperação").add(aluno);
            } else {
                gruposdenota.get("Reprovados").add(aluno);
            }
        }

        for (String grupo : gruposdenota.keySet()) {
            System.out.println(grupo + ": " + gruposdenota.get(grupo));
        }

    }

}
