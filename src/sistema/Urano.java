package sistema;

import java.net.URL;

/**
 * Created by abraa on 20/05/2016.
 */
public class Urano extends Planeta {
    @Override
    protected Double MeuPeso() {
        return 1.17;
    }

    @Override
    public URL MinhaImagem() {
        return this.getClass().getResource("./urano.gif");
    }
}
