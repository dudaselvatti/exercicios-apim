public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente donoDaConta) {
        super(donoDaConta);
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimentoBruto = 0;
        return rendimentoBruto; //conta corrente não tem rendimento tlgd
    }
}
