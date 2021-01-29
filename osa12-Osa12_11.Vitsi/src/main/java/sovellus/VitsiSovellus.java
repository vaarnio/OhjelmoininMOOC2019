package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VitsiSovellus extends Application {

    public void start(Stage ikkuna) {
        BorderPane asettelu = new BorderPane();

        HBox napit = new HBox();
        napit.setSpacing(20);

        Button vitsiButton = new Button("Vitsi");
        Button vastausButton = new Button("Vastaus");
        Button selitysButton = new Button("Selitys");

        napit.getChildren().addAll(vitsiButton, vastausButton, selitysButton);
        asettelu.setTop(napit);

        StackPane vitsiAsettelu = luoNakyma("What do you call a bear with no teeth?");
        StackPane vastausAsettelu = luoNakyma("A gummy bear.");
        StackPane selitysAsettelu = luoNakyma("gummy tarkoitta ikeniä");

        vitsiButton.setOnAction((event) -> asettelu.setCenter(vitsiAsettelu));
        vastausButton.setOnAction((event) -> asettelu.setCenter(vastausAsettelu));
        selitysButton.setOnAction((event) -> asettelu.setCenter(selitysAsettelu));

        asettelu.setCenter(vitsiAsettelu);
        Scene nakyma = new Scene(asettelu);

        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    private StackPane luoNakyma(String teksti) {
        StackPane asettelu = new StackPane();
        asettelu.setPrefSize(300, 180);
        asettelu.getChildren().add(new Label(teksti));

        return asettelu;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch(VitsiSovellus.class);
    }
}
