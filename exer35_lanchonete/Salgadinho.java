package exer35_lanchonete;

public class Salgadinho extends Prato {
    
    private static final double PRECO_BASE = 3.00;
    private static final double PESO_PADRAO = 0.210;
    private static final String VALIDADE_PADRAO = "4 dias";

    private String massasalg;
    private String tipo;
    private String recheiosalg;

    public Salgadinho(String massasalg, String tipo, String recheiosalg) {
        super(PRECO_BASE, PESO_PADRAO, VALIDADE_PADRAO);
        this.massasalg = massasalg;
        this.tipo = tipo;
        this.recheiosalg = recheiosalg;
    }


    @Override
    public double calcularPreco() {
        double preco = getPreco();
        //fiz essa lógica de preços simplesmente por testes e etc mas sla se faz sentido kkkkjkkkkk
        //se o tipo for "frito", adiciona R$ 1,00, se for "assado", adiciona R$ 0,50
        if ("frito".equalsIgnoreCase(tipo)) {
            preco += 1.0; 
        } else if ("assado".equalsIgnoreCase(tipo)) {
            preco += 0.5; 
        }
        //se a massa for "trigo", adiciona R$ 0,50, se for "milho", adiciona R$ 0,30
        if ("trigo".equalsIgnoreCase(massasalg)) {
            preco += 0.5; 
        } else if ("milho".equalsIgnoreCase(massasalg)) {
            preco += 0.3;
        }
        //se o recheio for "carne", adiciona R$ 2,00, se for "frango", adiciona R$ 1,50
        if ("carne".equalsIgnoreCase(recheiosalg)) {
            preco += 2.0; 
        } else if ("frango".equalsIgnoreCase(recheiosalg)) {
            preco += 1.5; 
        }
        return preco;
    }

    @Override
    public String toString() {
        return "Salgadinho " + this.tipo + " de " + this.recheiosalg + " (Massa: " + this.massasalg + ")\n" + "Peso: " + getPeso() + "kg | " + "Validade: " + getDataValidade() + "\n";
    }
    
}
