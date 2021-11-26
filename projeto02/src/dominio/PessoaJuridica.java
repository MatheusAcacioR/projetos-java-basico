package dominio;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String razsoc;

    // Metodos especiais
    // Constructor
    public PessoaJuridica(String ad, int tel, String cn, String rs) {
        //super recebendo os atributos vindo da classe Cliente
        super(ad, tel);
        this.cnpj = cn;
        this.razsoc = rs;
    }

    // Getters e Setters

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazsoc() {
        return razsoc;
    }
    public void setRazsoc(String razsoc) {
        this.razsoc = razsoc;
    }

}
