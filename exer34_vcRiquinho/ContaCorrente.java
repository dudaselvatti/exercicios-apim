public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, Cliente donoDaConta) {
        super(saldo, donoDaConta);
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimentoBruto = 0;
        return rendimentoBruto; //conta corrente não tem rendimento tlgd
    }
}
