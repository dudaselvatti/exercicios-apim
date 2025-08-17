public abstract class Conta {

    private double saldo;
    private Cliente donoDaConta;

    public Conta(double saldo, Cliente donoDaConta) {
        this.saldo = saldo;
        this.donoDaConta = donoDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double calcularRendimento(int dias);

}
