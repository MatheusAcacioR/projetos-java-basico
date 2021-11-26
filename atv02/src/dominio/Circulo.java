package dominio;

public class Circulo implements Poligono {
    private float raio;

    public Circulo(float rai) {
        this.raio = rai;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float calculaArea() {
        return (float) Math.PI * (float) Math.pow(raio, 2);
    }
}