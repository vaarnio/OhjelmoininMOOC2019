package tekstitilastointia;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    public void start(Stage ikkuna){
        HBox hbox = new HBox();
        hbox.getChildren().add(new Label("Kirjaimia: 0"));
        hbox.getChildren().add(new Label("Sanoja: 0"));
        hbox.getChildren().add(new Label("Pisin sana on:"));

        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(new TextArea());
        asettelu.setBottom(hbox);

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TekstitilastointiaSovellus.class);
    }

}
