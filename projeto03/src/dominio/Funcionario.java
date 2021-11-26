package dominio;

public class Funcionario {
    private int matricula;
    private String name;
    private float salario;

    public Funcionario(int mat, String nm, float sal) {
        this.matricula = mat;
        this.name = nm;
        this.salario = sal;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

}
