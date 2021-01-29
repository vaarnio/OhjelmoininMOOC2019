package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public void start(Stage ikkuna){

        //kolmas näkymä
        GridPane gridPane = new GridPane();
        Scene kolmas = new Scene(gridPane);
        Label kolmasTeksti = new Label("Kolmas näkymä!");
        Button kolmasNappi = new Button("Ekaan näkymään!");

        gridPane.add(kolmasTeksti,0 ,0);
        gridPane.add(kolmasNappi, 1 ,1);

        //toka näkymä
        VBox vbox = new VBox();
        Scene toka = new Scene(vbox);
        Button tokaNappi = new Button("Kolmanteen näkymään!");
        Label tokaTeksti = new Label("Toka näkymä!");

        vbox.getChildren().addAll(tokaNappi, tokaTeksti);

        //eka näkymä
        BorderPane borderPane = new BorderPane();
        Scene eka = new Scene(borderPane);
        Label ekaTeksti = new Label("Eka näkymä!");
        Button ekaNappi = new Button("Tokaan näkymään!");

        borderPane.setTop(ekaTeksti);
        borderPane.setCenter(ekaNappi);

        //Button on action listeners
        ekaNappi.setOnAction((event) -> {
            ikkuna.setScene(toka);
        });

        tokaNappi.setOnAction((event) -> {
            ikkuna.setScene(kolmas);
        });

        kolmasNappi.setOnAction((event) -> {
            ikkuna.setScene(eka);
        });

        ikkuna.setScene(eka);
        ikkuna.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }

}
