package dominio;

public class Diretor extends Funcionario{
    private float bonificacao;

    // Metodos especiais
    //Constructor
    public Diretor(int mat, String nm, float sal, float bon) {
        // Atributos vindos da classe Funcionario
        super(mat, nm, sal);
        this.bonificacao = bon;
    }

    // Getter e Setter
    public float getBonificacao() {
        return bonificacao;
    }
    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    public float salarioTotal() {
        return super.getSalario() + super.getSalario()/bonificacao;
    }

}
