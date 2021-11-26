package dominio;

public class Trapezio implements Poligono {
    private float baseMenor, baseMaior, altura;

    public Trapezio(float bmen, float bmai, float alt) {
        this.baseMenor = bmen;
        this.baseMaior = bmai;
        this.altura = alt;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    public float getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(float baseMaior) {
        this.baseMaior = baseMaior;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calculaArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}