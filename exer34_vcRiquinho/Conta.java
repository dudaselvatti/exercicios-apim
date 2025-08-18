public abstract class Conta {

    private double saldo;
    private Cliente donoDaConta;

    public Conta(Cliente donoDaConta) {
        if (donoDaConta == null) {
            throw new IllegalArgumentException("Uma conta não pode ser criada sem um dono.");
        }
        this.donoDaConta = donoDaConta;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    protected Cliente getDonoDaConta() {
        return this.donoDaConta;
    }

    public abstract double calcularRendimento(int dias);

}
