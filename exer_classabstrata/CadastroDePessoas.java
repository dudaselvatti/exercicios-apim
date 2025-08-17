package exer_classabstrata;

public class CadastroDePessoas {

    public int qtdAtual;
    private Pessoa[] pessoas;

    public CadastroDePessoas(int tamanho) {
        pessoas = new Pessoa[tamanho];
        qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa pessoa) {
        if (qtdAtual < pessoas.length) {
            pessoas[qtdAtual] = pessoa;
            qtdAtual++;
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    public void imprimeCadastro() {
        System.out.println("\n--- RELATÓRIO DE CADASTRO ---");
        for (int i = 0; i < this.qtdAtual; i++) {
            pessoas[i].imprimirDados();
            System.out.println("--------------------");
        }
    }
}
