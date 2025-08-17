import java.util.ArrayList;

public class PF extends Cliente {
    
    private String cpf;

    public PF(String nome, String email, ArrayList<Conta> contas, String cpf){
        super(nome, email, contas);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void criarConta(){
        
    }
}
