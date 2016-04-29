package q1;

import java.util.ArrayList;

/**
 * Created by abraa on 29/04/2016.
 */
public class ComputerKit {
    private final ArrayList<ComputerPart> lista;

    public ComputerKit(){
        this.lista = new ArrayList<ComputerPart>();
    }
    public void addPart(ComputerPart part) {
        this.lista.add(part);
    }

    public String temperaturaPreco() {
        double preco = this.precoTotal();

        if(preco > 1000){
            return "caro";
        }
        if(preco < 250){
            return "barato";
        }

        return "normal";
    }

    private double precoTotal() {
        return lista.stream().mapToDouble(p -> p.getPreco()).sum();
    }

    public boolean contains(String item) {
        return this.count(item) > 0;
    }

    public int count(String item) {
        return  (int)lista.stream().filter(p -> p.getNome() == item).count();
    }
}
