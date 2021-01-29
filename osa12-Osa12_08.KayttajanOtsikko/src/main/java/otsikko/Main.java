package otsikko;


import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage ikkuna) {
        Application.Parameters params = getParameters();
        String ikkunanOtsikko = params.getNamed().get("otsikko");

        ikkuna.setTitle(ikkunanOtsikko);
        ikkuna.show();
    }

    public static void main(String[] args) {
        KayttajanOtsikko ui = new KayttajanOtsikko();
        String otsikkoParam = "--otsikko=" + ui.kysy();
        Application.launch(otsikkoParam);
    }
}
