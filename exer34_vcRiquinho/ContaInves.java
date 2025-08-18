import java.util.ArrayList;
import java.util.List;

public class ContaInves extends Conta implements Tributavel{

    private List<ProdutoInves> carteira;
    
    public ContaInves(Cliente donoDaConta) {
        super(donoDaConta);
        this.carteira = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoInves produto) {
        this.carteira.add(produto);
    }

    public List<ProdutoInves> getCarteira() {
        return this.carteira;
    }

    @Override
    public double calcularRendimento(int dias) {

        if(carteira.isEmpty()){
            return 0.0;
        }
        
        double saldoPorProduto = this.getSaldo()/carteira.size();
        double rendimentoTotal = 0.0;

        for (ProdutoInves produto : carteira){
            rendimentoTotal += produto.calcularRendimentoProjetado(saldoPorProduto, dias);
        }

        return rendimentoTotal;
    }

    @Override
    public double calcularTaxaServico(double rendimentoBruto) {

        Cliente dono = this.getDonoDaConta();

        if(dono instanceof PF){
            return rendimentoBruto * 0.001;
        }else{
            return rendimentoBruto * 0.0015;
        }
    }
}
