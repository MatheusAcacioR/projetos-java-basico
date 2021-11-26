package aula05;

public class Lutador {
    // Atributos
    private String name;
    private String nacionality;
    private float height;
    private float peso;
    private String category;
    private int age, vitories, derrotas, empates;

    // Metodos publicos
    public void apresentar() {
        System.out.format("nome: %s", this.getName());
        System.out.format("nome: %s", this.getName());
        System.out.format("nome: %s", this.getName());
        System.out.format("nome: %s", this.getName());
    }
    public void status() {

    }
    public void ganharLuta() {
        this.setVitories(this.getVitories() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metodos especiais 
    public Lutador(String nm, String na, float he, float pe, String ca, int ag, int vi, int de, int em) {
        this.name = nm;
        this.nacionality = na;
        this.height = he;
        this.setPeso(pe);
        this.category = ca;
        this.age = ag;
        this.vitories = vi;
        this.derrotas = de;
        this.empates = em;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }
    private void setCategory() {
        if (this.peso < 52.2) {
            this.category = "Invalido";
        } else if (this.peso <= 70.3) {
            this.category = "Leve";
        } else if (this.peso <= 83.9) {
            this.category = "Médio";
        } else if (this.peso <= 120.2) {
            this.category = "Pesado";
        } else {
            this.category = "Invalido";
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getVitories() {
        return vitories;
    }
    public void setVitories(int vitories) {
        this.vitories = vitories;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

}