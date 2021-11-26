package aula04;

public class Caneta {
    public String model;
    private float point;
    private String color;
    private boolean tampada;

    public Caneta(String m, float p, String c) {
        this.tampar();
        this.color = c;
        this.model = m;
        this.point = p;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float p) {
        this.point = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a caneta");
        System.out.println("Modelo: " + this.model);
        System.out.println("Ponta: " + this.point);
        System.out.println("Cor: " + this.color);
        System.out.println("Tampa: " + this.tampada);
    }

}

