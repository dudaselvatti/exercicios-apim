package exer35_lanchonete;

public class Pizza extends Prato {

    private static final double PRECO_BASE = 30.0;
    private static final double PESO_PADRAO = 0.360;
    private static final String VALIDADE_PADRAO = "4 dias";

    private String molhopizza;
    private String borda;
    private String sabor;

    public Pizza(String molhopizza, String borda, String sabor) {
        super(PRECO_BASE, PESO_PADRAO, VALIDADE_PADRAO);
        this.molhopizza = molhopizza;
        this.borda = borda;
        this.sabor = sabor;
    }

    @Override
    public double calcularPreco() {
        double preco = getPreco();
        //se o molho for "tomate", adiciona R$ 1,00, se for "branco", adiciona R$ 0,50
        if ("tomate".equalsIgnoreCase(molhopizza)) {
            preco += 1.0; 
        } else if ("branco".equalsIgnoreCase(molhopizza)) {
            preco += 0.5; 
        }
        //se a borda for "recheada", adiciona R$ 2,00, se for "normal", não adiciona nada
        if ("recheada".equalsIgnoreCase(borda)) {
            preco += 2.0; 
        }
        //se o sabor for "carne", adiciona R$ 2,00, se for "frango", adiciona R$ 1,50
        if ("carne".equalsIgnoreCase(sabor)) {
            preco += 2.0; 
        } else if ("frango".equalsIgnoreCase(sabor)) {
            preco += 1.5; 
        }
        return preco;
    }


    @Override
    public String toString() {
        return "Pizza de " + this.sabor + " com borda " + this.borda + " (Molho: " + this.molhopizza + ")\n"+ "Peso: " + getPeso() + "kg | " + "Validade: " + getDataValidade() + "\n";
    }
}
