package sistema;

import java.net.URL;

/**
 * Created by abraa on 20/05/2016.
 */
public class Mercurio extends Planeta {

    @Override
    protected Double MeuPeso() {
        return 0.37;
    }

    @Override
    public URL MinhaImagem() {
        return this.getClass().getResource("./mercurio.jpg");
    }
}
