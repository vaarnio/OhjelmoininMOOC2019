package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {

    public void piirrakaavio(LineChart kaavio, Slider tallennusLiuku, Slider korkoLiuku){
        int index = 0;
        Double kokonaisuusTalletus = 0.0;
        Double kokonaisuusKorko = 0.0;

        XYChart.Series talletusData = new XYChart.Series();
        XYChart.Series korkoData = new XYChart.Series();

        kaavio.getData().clear();

        while(index <= 30){
            talletusData.getData().add(new XYChart.Data(index, kokonaisuusTalletus));
            korkoData.getData().add(new XYChart.Data(index, kokonaisuusKorko));
            kokonaisuusTalletus = kokonaisuusTalletus + tallennusLiuku.getValue()*12;
            kokonaisuusKorko = (kokonaisuusKorko + tallennusLiuku.getValue()*12) * (1+ korkoLiuku.getValue()/100);
            index++;
        }

        kaavio.getData().addAll(talletusData, korkoData);
    }

    public void start(Stage ikkuna){
        BorderPane asettelu = new BorderPane();
        VBox ylalaita = new VBox();

        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis();
        LineChart kaavio = new LineChart(xAkseli, yAkseli);

        Slider tallennusLiuku = new Slider();
        tallennusLiuku.setMin(25);
        tallennusLiuku.setMax(250);
        tallennusLiuku.setSnapToTicks(true);
        tallennusLiuku.setBlockIncrement(500);
        tallennusLiuku.setShowTickLabels(true);
        tallennusLiuku.setShowTickMarks(true);

        Slider korkoLiuku = new Slider();
        korkoLiuku.setMin(0);
        korkoLiuku.setMax(10);
        korkoLiuku.setMinorTickCount(10);
        korkoLiuku.setShowTickLabels(true);
        korkoLiuku.setShowTickMarks(true);

        BorderPane tallennusAsettelu = new BorderPane();
        Label tallennusArvo = new Label(tallennusLiuku.getValue() + "");
        tallennusAsettelu.setLeft(new Label("Kuukausittainen tallennus"));
        tallennusAsettelu.setCenter(tallennusLiuku);
        tallennusAsettelu.setRight(tallennusArvo);

        BorderPane korkoAsettelu = new BorderPane();
        Label korkoArvo = new Label(korkoLiuku.getValue() + "");
        korkoAsettelu.setLeft(new Label("Vuosittainen korko"));
        korkoAsettelu.setCenter(korkoLiuku);
        korkoAsettelu.setRight(korkoArvo);

        tallennusLiuku.valueProperty().addListener((observable, oldValue, newValue) -> {
            tallennusArvo.setText(newValue + "");
            piirrakaavio(kaavio, tallennusLiuku, korkoLiuku);
        });

        korkoLiuku.valueProperty().addListener((observable, oldValue, newValue) -> {
            korkoArvo.setText(newValue + "");
            piirrakaavio(kaavio, tallennusLiuku, korkoLiuku);
        });

        ylalaita.getChildren().addAll(tallennusAsettelu, korkoAsettelu);
        asettelu.setCenter(kaavio);
        asettelu.setTop(ylalaita);

        Scene nakyma = new Scene(asettelu, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();

    }



    public static void main(String[] args) {
        Application.launch();
    }

}
