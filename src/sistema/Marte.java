package sistema;

import java.net.URL;

/**
 * Created by abraa on 20/05/2016.
 */
public class Marte extends Planeta {
    @Override
    protected Double MeuPeso() {
        return 0.38;
    }

    @Override
    public URL MinhaImagem() {
        return this.getClass().getResource("./marte.png");
    }
}
