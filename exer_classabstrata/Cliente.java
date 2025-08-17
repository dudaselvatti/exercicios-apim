package exer_classabstrata;

public class Cliente extends Pessoa {
    
    public int codigo;

    public Cliente(String nome, Data dataNasc, int codigo) {
        super(nome, dataNasc);
        this.codigo = codigo;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc.dia + "/" + dataNasc.mes + "/" + dataNasc.ano);
    }

}
