import javax.swing.*;
import java.io.IOException;

/**
 * Created by abraa on 20/05/2016.
 */
public class Main {

    public static void main(String[] args){

        try {
            Planetas planetas = new Planetas();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
