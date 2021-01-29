package nappijatekstielementti;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstielementtiSovellus extends Application {

    public void start(Stage ikkuna){
        Button nappi = new Button("Nappi");
        Label teksti = new Label("Teksti");

        FlowPane komponenttiryhmä = new FlowPane();
        komponenttiryhmä.getChildren().add(nappi);
        komponenttiryhmä.getChildren().add(teksti);

        Scene nakyma = new Scene(komponenttiryhmä);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

}
