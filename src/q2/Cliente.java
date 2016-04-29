package q2;

/**
 * Created by abraa on 29/04/2016.
 */
public class Cliente {
    public static void main(String[] args){
        Poligono circulo = new Circulo(3);
        Poligono retangulo = new Retangulo(2, 4);

        System.out.println("O perimetro do circulo é: " + circulo.perimetro());
        System.out.println("A area do circulo é: " + circulo.area());
        System.out.println("O perimetro do retangulo é: " + retangulo.perimetro());
        System.out.println("A area do retangulo é: " + retangulo.area());
    }
}
