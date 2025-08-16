package exer_classabstrata;

import java.util.ArrayList;

public class CadastroDePessoas {
    public int qtdAtual;

    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastraPessoa(Pessoa pessoa) {
        
        pessoas.add(pessoa);
        qtdAtual++;
        System.out.println("Pessoa cadastrada: " + pessoa.getNome());
    }

    public void imprimeCadastro() {
        for (Pessoa p : pessoas) {
            p.imprimirDados();
        }
    }
}
