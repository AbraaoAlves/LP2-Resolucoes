import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by abraa on 20/05/2016.
 */
public class CalcularPeso {
    public static Double Peso(String nomePlaneta, Double peso){
        switch (nomePlaneta){
            case "Mercurio":
            {
                return peso * 0.37;
            }

            case "Venus":
            {
                return peso *0.88;
            }

            case "Marte":
            {
                return peso * 0.38;
            }

            case "Jupiter":
            {
                return peso *2.64;
            }

            case "Saturno":
            {
                return peso * 1.15;
            }

            case "Urano":
            {
                return peso * 1.17;
            }
            default:
                return 0.0;
        }
    }

}
