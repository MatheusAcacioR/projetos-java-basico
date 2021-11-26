package dominio;

public class Cliente {
    private String adress;
    private int telefone;

    //Metodos especiais
    // Constructor
    public Cliente(String ad, int tel) {
        this.adress = ad;
        this.telefone = tel;
    }

    // Getters e Setters
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

}
