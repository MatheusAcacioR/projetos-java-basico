package dominio;

public class Aluno {
    private String matr;
    private float teste;
    private float prova;
    private float med;

    public Aluno(String matr, float teste, float prova) {
        // ! Objeto da classe cpf/name vai receber o valor vindo do atributo cpf/name
        this.matr = matr;
        this.teste = teste;
        this.prova = prova;
    }
        
    // ! Buscando as informações dos metodos privados - Metodos gets e sets
    public String getMatr() {
        return matr;
    }
    public void setMatr(String matr) {
        this.matr = matr;
    }
    public float getTeste() {
        return teste;
    }
    public void setTeste(float teste) {
        this.teste = teste;
    }

    public float getProva() {
        return prova;
    }
    public void setProva(float prova) {
        this.prova = prova;
    }

    public float getMed() {
        return med;
    }
    public void setMed(float med) {
        this.med = med;
    }

    public void calculaMedia() {
		med = (teste + prova) / 2;
	}
}
