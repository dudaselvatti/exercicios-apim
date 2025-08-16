package exer_classabstrata;

public class Cliente extends Pessoa {
    
    public int codigo;

    public Cliente(int codigo, String nome, Data dataNasc) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc.dia + "/" + dataNasc.mes + "/" + dataNasc.ano);
    }

}
