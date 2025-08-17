import java.util.ArrayList;

public class ContaInves extends Conta implements Tributavel{
    
    private double taxaRendimento;
    private ArrayList<ProdutoInves> produtosInves;
    
    public ContaInves(double saldo, Cliente donoDaConta, double taxaRendimento) {
        super(saldo, donoDaConta);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimentoBruto = 0;

        return rendimentoBruto;
    }

    @Override
    public double calcularTaxaServico(double rendimentoBruto) {
        throw new UnsupportedOperationException("Unimplemented method 'calcularTaxaServico'");
    }
}
