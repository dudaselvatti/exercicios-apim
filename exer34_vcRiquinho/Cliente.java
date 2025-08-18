import java.util.ArrayList;
import java.util.List;
public abstract class Cliente {
    
    private String nome;
    private String email;
    private List<Conta> contas;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.contas = new ArrayList<>();
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

    public void adicionarConta(Conta novaConta){
        this.contas.add(novaConta);
    }

    public boolean removerConta(Conta conta){
        return this.contas.remove(conta);
    }

    public List<Conta> getContas() {
        return this.contas;
    }



}
