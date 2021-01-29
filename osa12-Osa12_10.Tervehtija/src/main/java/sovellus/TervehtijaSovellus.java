package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class TervehtijaSovellus extends Application {

    public void start(Stage ikkuna){
        //login
        Label annaNimi = new Label("Kirjoita nimesi ja aloita.");
        TextField nimi = new TextField();
        Button aloita = new Button("Aloita");

        GridPane asettelu = new GridPane();

        asettelu.add(annaNimi, 0,1);
        asettelu.add(nimi, 0,2);
        asettelu.add(aloita, 0,3);

        //tervehdys
        Label tervehdys = new Label("");

        GridPane asetteluTervehdys = new GridPane();

        asetteluTervehdys.add(tervehdys, 0,1);

        //luo scenet
        Scene login = new Scene(asettelu);
        Scene tervehdysScene = new Scene(asetteluTervehdys);

        //button listener
        aloita.setOnAction((event) -> {
            String annettuNimi = nimi.getText();
            tervehdys.setText("Tervetuloa " + annettuNimi + "!");
            ikkuna.setScene(tervehdysScene);
        });

        ikkuna.setScene(login);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hellow world!");
        Application.launch();
    }
}
