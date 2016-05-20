package sistema;

import java.net.URL;

/**
 * Created by abraa on 20/05/2016.
 */
public class Jupiter extends Planeta {
    @Override
    protected Double MeuPeso() {
        return 2.64;
    }

    @Override
    public URL MinhaImagem() {
        return this.getClass().getResource("./jupiter.jpg");
    }
}
