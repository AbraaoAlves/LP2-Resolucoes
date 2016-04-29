package q2;

/**
 * Created by abraa on 29/04/2016.
 */
public abstract class Poligono {
    protected final double PI;

    protected Poligono(){
        this.PI = 3.14;
    }
    public abstract double perimetro();

    public abstract double area();
}
