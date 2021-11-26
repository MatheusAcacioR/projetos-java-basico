package dominio;

public class Vendedor extends Funcionario {
    private float comission;

    // Metodos especiais
    // Constructor
    public Vendedor(String nm, float pa, float co) {
        // super recebendo os atributos vindo da classe Funcionario
        super(nm, pa);
        this.comission = co;
    }

    // Getter e Setter
    public float getComission() {
        return comission;
    }
    public void setComission(float comission) {
        this.comission = comission;
    }

    public float totalPay() {
        return super.getPay() + comission;
    }

}
