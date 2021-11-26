package dominio;

public class Aluno {
    private String matr;
    private float teste;
    private float prova;
    private float med;

    public Aluno(String cpf, float teste, float prova) {
        this.matr = matr;
        this.teste = teste;
        this.prova = prova;
    }
    public String getMatr() {
        return matr;
    }
    public void setMatr(String matr) {
        this.matr = matr;
    }
    public String getTeste() {
        return teste;
    }
    public void setTeste(String teste) {
        this.teste = teste;
    }

    public String getProva() {
        return prova;
    }
    public void setProva(String prova) {
        this.prova = prova;
    }

    public String getMed() {
        return med;
    }
    public void setMed(String med) {
        this.med = med;
    }

    public void calculaMedia() {
		med = (teste + prova) / 2;
	}

}