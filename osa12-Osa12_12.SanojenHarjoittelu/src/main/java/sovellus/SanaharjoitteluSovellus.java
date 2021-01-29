package sovellus;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import sovellus.nakymat.Harjoittelunakyma;
import sovellus.nakymat.Syottonakyma;

// END SOLUTION
public class SanaharjoitteluSovellus extends Application {
    private Sanakirja sanakirja;

    public void init() throws Exception {
        // 1. Luodaan sovelluksen käyttämä sanakirja
        this.sanakirja = new Sanakirja();
    }

    public void start(Stage ikkuna){
        Harjoittelunakyma harjoittelunakyma = new Harjoittelunakyma(this.sanakirja);
        Syottonakyma syottonakyma = new Syottonakyma(this.sanakirja);

        BorderPane asettelu = new BorderPane();

        HBox valikko = new HBox();
        valikko.setSpacing(20);

        Button lisaysnappi = new Button("Lisaa sanoja");
        Button harjoitteunappi = new Button("Harjoittele");

        valikko.getChildren().addAll(lisaysnappi,harjoitteunappi);
        asettelu.setTop(valikko);

        lisaysnappi.setOnAction((event) -> asettelu.setCenter(syottonakyma.getNakyma()));
        harjoitteunappi.setOnAction((event) -> asettelu.setCenter(harjoittelunakyma.getNakyma()));

        asettelu.setCenter(syottonakyma.getNakyma());

        Scene nakyma = new Scene(asettelu, 200, 300);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
