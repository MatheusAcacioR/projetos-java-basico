package dominio;

public class Curso {
    private int codigo;
    private String descricao;
    private Professor[] listaProf;
    private int i;

    public Curso(int cod, String desc) {
        this.codigo = cod;
        this.descricao = desc;
        listaProf = new Professor[3];
        i = 0;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void addProf(Professor novoProf) {
        if (i < listaProf.length) {
            listaProf[i] = novoProf;
            i++;
            novoProf.setCurso(this);
        }
        else
            return;
    }

}