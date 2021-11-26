package dominio;

public class Funcionario {
    private String name;
    private float pay;

    // Metodos especiais
    // Constructor
    public Funcionario(String nm, float pa) {
        this.name = nm;
        this.pay = pa;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getPay() {
        return pay;
    }
    public void setPay(float pay) {
        this.pay = pay;
    }

}
