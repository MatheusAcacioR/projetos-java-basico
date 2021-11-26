package dominio;

public class PessoaFisica extends Cliente{
    private String cpf;
    private String name;

    // Metodos Especiais
    // Constructor
    public PessoaFisica(String ad, int tel, String cp, String nm) {
        // super recebendo os atributos vindo da classe Cliente
        super(ad, tel);
        this.name = nm;
        this.cpf = cp;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
