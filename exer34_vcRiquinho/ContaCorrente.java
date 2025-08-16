public class ContaCorrente extends Conta {

    private String agencia;

    public ContaCorrente(double saldo, String agencia) {
        super(saldo);
        this.agencia = agencia;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public void calcularRendimento() {
        // Implementar cálculo de rendimento para conta corrente
    }
}
