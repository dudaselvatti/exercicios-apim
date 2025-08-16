package exer35_lanchonete;

public abstract class Prato {
    
    private double preco;
    private double peso;
    private String dataValidade;

    public Prato(double preco, double peso, String dataValidade) {
        this.preco = preco;
        this.peso = peso;
        this.dataValidade = dataValidade;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public abstract double calcularPreco();

    @Override
    public String toString() {
        return "Prato{" +
                "preco=" + preco +
                ", peso=" + peso +
                ", dataValidade='" + dataValidade + '\'' +
                '}';
    }

}
