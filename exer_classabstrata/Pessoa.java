package exer_classabstrata;

public abstract class Pessoa {
    String nome;
    Data dataNasc;

    public Pessoa(String nome, Data dataNasc){
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
    
    public abstract void imprimirDados();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
