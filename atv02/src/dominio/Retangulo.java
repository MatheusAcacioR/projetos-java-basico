package dominio;

public class Retangulo implements Poligono {
    private float base, altura;

    public Retangulo(float bas, float alt) {
        this.base = bas;
        this.altura = alt;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calculaArea() {
        return base * altura;
    }
}