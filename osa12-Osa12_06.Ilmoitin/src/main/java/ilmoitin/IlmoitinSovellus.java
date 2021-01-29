package ilmoitin;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IlmoitinSovellus extends Application {

    public void start(Stage ikkuna){
        TextField tekstikentta = new TextField();
        Label teksti = new Label();
        Button nappi = new Button("Päivitä");

        nappi.setOnAction((event) -> {
            teksti.setText(tekstikentta.getText());
        });

        VBox asettelu = new VBox();
        asettelu.getChildren().addAll(tekstikentta, nappi, teksti);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch();
    }

}
