package exer_classabstrata;

public class TestaCadastro {
    public static void main(String[] args) {
        CadastroDePessoas cadastro = new CadastroDePessoas();;

        Cliente cliente = new Cliente(150, "Maria", new Data(10, 5, 2000));
        Funcionario funcionario = new Funcionario(3000f, "João", new Data(20, 8, 1995));
        Gerente gerente = new Gerente("Gerente", 5000f, "Carla", new Data(15, 3, 1980));

        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(gerente);

        cadastro.imprimeCadastro();
    }
}
