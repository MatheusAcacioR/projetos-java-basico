package dominio;

public class Vendedor extends Funcionario {
    private float comissao;

    // Metodos especiais
    // Constructor
    public Vendedor(int mat, String nm, float sal, float com) {
        // Atributos vindos da classe Funcionario
        super(mat, nm, sal);
        this.comissao = com;
    }

    // Getter e Setter
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    // Salario total do vendedor: salario + comissão
    public float salarioTotal() {
        return super.getSalario() + comissao;
    }

}
