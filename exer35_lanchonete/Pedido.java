package exer35_lanchonete;

import java.util.ArrayList;

public class Pedido {

    private String nomeCliente;
    private double taxaServico; 
    private ArrayList<Prato> itensConsumidos;

    public Pedido(String nomeCliente, double taxaServico) {
        this.nomeCliente = nomeCliente;
        this.taxaServico = taxaServico;
        this.itensConsumidos = new ArrayList<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void adicionarItem(Prato prato) {
        itensConsumidos.add(prato);
    }

    public double calcularTotal() {
        double subtotal = 0.0;
        for (Prato item : itensConsumidos) {
            subtotal += item.calcularPreco();
        }

        double valorTaxa = subtotal * this.taxaServico;
        return subtotal + valorTaxa;
    }

    public double calcularTroco(double valorPago) {
        return valorPago - this.calcularTotal();
    }
    
    public void mostrarFatura() {
        double subtotal = 0.0;
        System.out.println("==============================================");
        System.out.println("              Fatura do Pedido                ");
        System.out.println("==============================================");
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("\nItens Consumidos:");

        for (Prato prato : itensConsumidos) {
            double precoDoItem = prato.calcularPreco();
            System.out.printf("- \n\n%s | Subtotal: R$ %.2f\n", prato.toString(), precoDoItem);
            subtotal += precoDoItem;
        }
        double valorTaxa = subtotal * this.taxaServico;
        double totalAPagar = subtotal + valorTaxa;

        System.out.println("\n----------------------------------------------");
        System.out.printf("Subtotal dos Itens: R$ %.2f\n", subtotal);
        System.out.printf("Taxa de Serviço (%.0f%%): R$ %.2f\n", this.taxaServico * 100, valorTaxa);
        System.out.println("----------------------------------------------");
        System.out.printf("TOTAL A PAGAR: R$ %.2f\n", totalAPagar);
        System.out.println("==============================================");

    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", taxaServico=" + taxaServico +
                ", itensConsumidos=" + itensConsumidos +
                '}';
    }
}