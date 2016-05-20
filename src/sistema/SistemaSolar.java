package sistema;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by abraa on 20/05/2016.
 */
public class SistemaSolar {
    private ArrayList<Planeta> planetas;

    public SistemaSolar(){
        planetas = new ArrayList<Planeta>();

        planetas.add(new Mercurio());
        planetas.add(new Venus());
        planetas.add(new Marte());
        planetas.add(new Saturno());
        planetas.add(new Jupiter());
        planetas.add(new Urano());
    }

    public Planeta EncontrarPlaneta(String nomePlaneta) {
        Predicate<Planeta> planetaPredicate = p -> p.getClass().getSimpleName().equals(nomePlaneta);

        ArrayList<Planeta> lista = this.planetas.stream().filter(planetaPredicate)
                .collect(Collectors.toCollection(ArrayList<Planeta>::new));

        return lista.get(0);
    }
}
