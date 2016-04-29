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
        double res = 0;
        for(ComputerPart item:lista){
            res+=item.getPreco();
        }
        return res;
    }

    public boolean contains(String item) {
        return this.count(item) > 0;
    }

    public int count(String item) {
        int res = 0;
        for(ComputerPart item$:lista){
            if(item$.getNome() == item){
                res++;
            }
        }
        return res;
    }
}
