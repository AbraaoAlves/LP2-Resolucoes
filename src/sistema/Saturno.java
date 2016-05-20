package sistema;

import java.net.URL;

/**
 * Created by abraa on 20/05/2016.
 */
public class Saturno extends Planeta {
    @Override
    protected Double MeuPeso() {
        return 1.15;
    }

    @Override
    public URL MinhaImagem() {
        return this.getClass().getResource("./saturno.png");
    }
}
