package dominio;

public class Professor {
    private String matricula, cpf, name;
    private Curso curso;

    public Professor(String mat, String cpf, String nm) {
        this.matricula = mat;
        this.cpf = cpf;
        this.name = nm;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}