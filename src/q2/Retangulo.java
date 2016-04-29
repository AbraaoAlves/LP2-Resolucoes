package q2;

/**
 * Created by abraa on 29/04/2016.
 */
public class Retangulo extends Poligono {
    private int altura;
    private int largura;

    public Retangulo(int altura, int largura) {
        super();
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double perimetro() {
        return (2*this.altura) + (2* this.largura);
    }

    @Override
    public double area() {
        return this.altura * this.largura;
    }
}
