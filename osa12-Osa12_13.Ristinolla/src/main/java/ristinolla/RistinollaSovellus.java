package ristinolla;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RistinollaSovellus extends Application {

    public void start(Stage ikkuna){
        Peli peli = new Peli();
        Label vuoro = new Label("Vuoro: X");
        Pelilautanakyma pelilautanakyma = new Pelilautanakyma(peli, vuoro);



        BorderPane asettelu = new BorderPane();
        asettelu.setTop(vuoro);
        asettelu.setCenter(pelilautanakyma.getNakyma());

        Scene nakyma = new Scene(asettelu, 200, 300);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch();
    }

}
