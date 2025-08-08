package exer8;

public class Teste {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("João", 1000.0);

        try{
            conta.sacar(1500.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
