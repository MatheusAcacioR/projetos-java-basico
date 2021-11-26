package dominio;

public class Quadrado implements Poligono{
    private float lado;

    public Quadrado(float lad) {
        this.lado = lad;
    }

    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }

    public float calculaArea() {  
        return lado * lado;
    }
}