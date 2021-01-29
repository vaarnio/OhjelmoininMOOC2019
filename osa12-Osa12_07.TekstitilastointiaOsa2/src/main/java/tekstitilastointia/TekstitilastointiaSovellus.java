package tekstitilastointia;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TekstitilastointiaSovellus extends Application {

    public void start(Stage ikkuna){
        Label kirjaimetL = new Label("Kirjaimia: 0");
        Label sanatL = new Label("Sanoja: 0");
        Label pisinL = new Label("Pisin sana on:");
        TextArea editor = new TextArea();

        HBox hbox = new HBox();
        hbox.setSpacing(20.0);
        hbox.getChildren().add(kirjaimetL);
        hbox.getChildren().add(sanatL);
        hbox.getChildren().add(pisinL);

        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(editor);
        asettelu.setBottom(hbox);

        editor.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
            int merkkeja = uusiArvo.length();
            String[] palat = uusiArvo.split(" ");
            int sanoja = palat.length;
            String pisin = Arrays.stream(palat)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // asetetaan arvot tekstielementteihin
            kirjaimetL.setText("Kirjaimia: " + merkkeja);
            sanatL.setText("Sanoja: " + sanoja);
            pisinL.setText("Pisin sana on: " + pisin);
        });

        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TekstitilastointiaSovellus.class);
    }

}