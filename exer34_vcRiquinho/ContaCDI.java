public class ContaCDI extends Conta implements Tributavel {

    private double taxaCDI;

    public ContaCDI(double saldo, Cliente donoDaConta, double taxaCDI) {
        super(saldo, donoDaConta);
        this.taxaCDI = taxaCDI;
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimentoBruto = 0;

        return rendimentoBruto;
    }

    @Override
    public double calcularTaxaServico(double rendimentoBruto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularTaxaServico'");
    }
}
