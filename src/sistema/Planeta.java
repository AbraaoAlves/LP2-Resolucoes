package sistema;

import java.net.URL;

/**
 * Created by abraa on 20/05/2016.
 */
public abstract class Planeta {
    protected abstract Double MeuPeso();
    //protected abstract String UrlDaImagem();

    public Double ConvertPeso(Double peso1){
        return peso1 * this.MeuPeso();
    }

    public abstract URL MinhaImagem();
}
