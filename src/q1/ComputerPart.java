package q1;

/**
 * Created by abraa on 29/04/2016.
 */
public class ComputerPart {
    private String nome;
    private int preco;

    public ComputerPart(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }
}
