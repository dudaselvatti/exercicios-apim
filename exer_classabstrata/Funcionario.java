package exer_classabstrata;

public class Funcionario extends Pessoa {
    
    public float salario;


    public Funcionario(float salario, String nome, Data dataNasc) {
        this.salario = salario;
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public float calculaImposto(){
        //3% do salario dele
        float imposto = (float) (salario * 0.03);
        return imposto;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc.dia + "/" + dataNasc.mes + "/" + dataNasc.ano);
        System.out.println("Salário: " + salario);
    }

}
