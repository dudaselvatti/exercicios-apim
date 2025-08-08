package exer8;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if ( valor > saldo) {
            throw new SaldoInsuficienteException("poxa o saldo ta insuficiente para saque de R$" + valor);
        }
        saldo -= valor;
    }

}
