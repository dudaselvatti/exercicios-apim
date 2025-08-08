package exer17;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outro) { //ordena pelo preco do menor pro maior 
        return Double.compare(this.preco, outro.preco);
    }

    public String toString() {
        return nome + " - R$ " + preco;
    }

}
