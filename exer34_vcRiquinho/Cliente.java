import java.util.ArrayList;
public abstract class Cliente {
    
    private String nome;
    private String email;
    private ArrayList<Conta> contas;

    public Cliente(String nome, String email, ArrayList<Conta> contas) {
        this.nome = nome;
        this.email = email;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void criarConta(){

    }

}
