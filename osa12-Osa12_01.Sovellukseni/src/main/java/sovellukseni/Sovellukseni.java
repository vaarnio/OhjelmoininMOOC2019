package sovellukseni;


import javafx.application.Application;
import javafx.stage.Stage;

public class Sovellukseni extends Application {
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(Sovellukseni.class);
    }

    @Override
    public void start(Stage ikkuna){
        ikkuna.setTitle("Sovellukseni");
        ikkuna.show();
    }
}
