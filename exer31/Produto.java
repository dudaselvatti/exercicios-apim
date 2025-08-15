package exer31;

class Produto {
    private int codigo;
    public String nome;
    protected double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    private double calcularImposto() {
        return preco * 0.1;
    }

    public static void main(String[] args) { 
    // No seu método main:
    // Produto p = new Produto(101, "Notebook Gamer", 8500.0);
    // AnalisadorDeClasse.inspecionar(p);
        Produto p = new Produto(101, "Notebook Gamer", 8500.0);
        AnalisadordeClasse.inspecionar(p);
    }
}