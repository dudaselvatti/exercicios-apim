package exer26;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Produto {
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
    public String toString() {
        return nome + " - R$" + preco;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Map<String, List<Produto>> produtosCat = new HashMap<>();

        produtosCat.put("Eletrônicos", Arrays.asList(
            new Produto("Smartphone", 1500.00),
            new Produto("Laptop", 3000.00),
            new Produto("Fone de Ouvido", 200.00)
        ));

        produtosCat.put("Roupas", Arrays.asList(
            new Produto("Camisa", 80.00),
            new Produto("Calça Jeans", 120.00),
            new Produto("Tênis", 250.00)
        ));

        produtosCat.put("Livros", Arrays.asList(
            new Produto("Livro de Java", 60.00),
            new Produto("Livro de Python", 70.00),
            new Produto("Percy Jackson", 90.00)
        ));

        int x = -1;

        while (x != 0) {

            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Listar Eletrônicos");
            System.out.println("2 - Listar Roupas");
            System.out.println("3 - Listar Livros");
            System.out.println("0 - Sair");

            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("\n=== Produtos Eletrônicos ===");
                    for (Produto produto : produtosCat.get("Eletrônicos")) {
                        System.out.println(produto);
                    }
                    break;
                case 2:
                    System.out.println("\n=== Produtos de Roupas ===");
                    for (Produto produto : produtosCat.get("Roupas")) {
                        System.out.println(produto);
                    }
                    break;
                case 3:
                    System.out.println("\n=== Produtos de Livros ===");
                    for (Produto produto : produtosCat.get("Livros")) {
                        System.out.println(produto);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    x = 0;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
        leitor.close();
    }


}
