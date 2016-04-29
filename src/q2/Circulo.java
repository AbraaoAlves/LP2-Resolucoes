package q2;

/**
 * Created by abraa on 29/04/2016.
 */
public class Circulo extends Poligono {
    private int raio;

    public Circulo(int raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double perimetro() {
        return 2 * this.PI * this.raio;
    }

    @Override
    public double area() {
        return this.PI * this.raio * this.raio;
    }
}
