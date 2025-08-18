public abstract class ProdutoInves {
    
    private String nome;
    private String descricao;

    public ProdutoInves(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularRendimentoProjetado(double valorInvestido, int dias);
}
