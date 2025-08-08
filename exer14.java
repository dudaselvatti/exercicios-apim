import java.util.HashSet;

public class exer14 {
    public static void main(String[] args) {
        
        HashSet<String> emails = new HashSet<>();

        emails.add("joao@email.com");
        emails.add("maria@email.com");
        emails.add("ana@email.com");
        emails.add("maria@email.com"); // duplicado pra testezin 

        System.out.println("Quantidade de e-mails: " + emails.size());
        System.out.println("E-mails armazenados: " + emails);
    }
}
