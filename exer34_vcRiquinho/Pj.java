public class PJ extends Cliente {

    private String cnpj;

    public PJ(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}