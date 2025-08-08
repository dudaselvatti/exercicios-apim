package exer17;
import java.util.TreeSet;


public class teste {
    public static void main(String[] args) {

    TreeSet<Produto> produtos = new TreeSet<>();

        produtos.add(new Produto("Notebook", 35.0));
        produtos.add(new Produto("Smartphone", 18.0));
        produtos.add(new Produto("Mouse", 12.0));
        produtos.add(new Produto("Monitor", 8.0));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}


