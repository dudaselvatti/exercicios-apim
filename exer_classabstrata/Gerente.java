package exer_classabstrata;

public class Gerente extends Funcionario {
    
    public String area;

    public Gerente(String area, float salario, String nome, Data dataNasc) {
        super(salario, nome, dataNasc);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        float imposto = (float) (salario * 0.10);
        return imposto;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc.dia + "/" + dataNasc.mes + "/" + dataNasc.ano);
        System.out.println("Salário: " + salario);
        System.out.println("Área: " + area);
    }



}
