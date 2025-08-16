package exer35_lanchonete;

public class Lanche extends Prato {

    private static final double PRECO_BASE = 15.0;
    private static final double PESO_PADRAO = 0.3; 
    private static final String VALIDADE_PADRAO = "4 dias";

    private String pao;
    private String recheio;
    private String molho;

    public Lanche(String pao, String recheio, String molho) {
        super(PRECO_BASE, PESO_PADRAO, VALIDADE_PADRAO);
        this.pao = pao;
        this.recheio = recheio;
        this.molho = molho;
    }


    @Override
    public double calcularPreco() {
        double preco = getPreco();
        //se o pão for "francês", adiciona R$ 0,50, se for "de forma", não adiciona nada
        if ("francês".equalsIgnoreCase(pao)) {
            preco += 0.5;
        }
        //se recheio for "carne", adiciona R$ 2,00, se for "frango", adiciona R$ 1,50
        if ("carne".equalsIgnoreCase(recheio)) {
            preco += 2.0;
        } else if ("frango".equalsIgnoreCase(recheio)) {
            preco += 1.5;
        }
        //se o molho for "maionese", adiciona R$ 0,50, se for "ketchup", não adiciona nada
        if ("maionese".equalsIgnoreCase(molho)) {
            preco += 0.5;
        }
        return preco;
    }

    @Override
    public String toString() {
        return "Lanche de " + this.recheio + " no pão " + this.pao + " (Molho: " + this.molho + ")\n" + "Peso: " + getPeso() + "kg | " + "Validade: " + getDataValidade() + "\n";
    }
}
