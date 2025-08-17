package exer_classabstrata;

public class TestaCadastro {
    public static void main(String[] args) {
        CadastroDePessoas cadastro = new CadastroDePessoas(3);
        System.out.println("Cadastro criado. Quantidade atual: " + cadastro.qtdAtual);

        Cliente cliente = new Cliente("Maria", new Data(10, 5, 2000), 12);
        Funcionario funcionario = new Funcionario("Jao", new Data(20, 8, 1995), 3000);
        Gerente gerente = new Gerente("Carla", new Data(15, 3, 1980), 5000, "Geral");

        System.out.println("\nCadastrando cliente...");
        cadastro.cadastraPessoa(cliente);
        System.out.println("Quantidade atual de pessoas: " + cadastro.qtdAtual);

        System.out.println("\nCadastrando funcionário...");
        cadastro.cadastraPessoa(funcionario);
        System.out.println("Quantidade atual de pessoas: " + cadastro.qtdAtual);

        System.out.println("\nCadastrando gerente...");
        cadastro.cadastraPessoa(gerente);
        System.out.println("Quantidade atual de pessoas: " + cadastro.qtdAtual);

        //teste de limite de qtd
        System.out.println("\nTentando cadastrar mais uma pessoa...");
        cadastro.cadastraPessoa(new Cliente("Teste Limite", new Data(1,1,2024), 99));


        cadastro.imprimeCadastro();
    }
}
