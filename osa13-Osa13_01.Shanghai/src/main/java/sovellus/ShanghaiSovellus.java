package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends  Application{

    public void start(Stage ikkuna){
        NumberAxis xAkseli = new NumberAxis(2006, 2018, 1);
        NumberAxis yAkseli = new NumberAxis();

        xAkseli.setLabel("Vuosi");
        yAkseli.setLabel("Sijoitus");

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli,yAkseli);
        viivakaavio.setTitle("Helsingin yliopisto, Shanghai-ranking");

        XYChart.Series hyData = new XYChart.Series();

        hyData.getData().add(new XYChart.Data(2007, 73));
        hyData.getData().add(new XYChart.Data(2008, 68));
        hyData.getData().add(new XYChart.Data(2009, 72));
        hyData.getData().add(new XYChart.Data(2010, 72));
        hyData.getData().add(new XYChart.Data(2011, 74));
        hyData.getData().add(new XYChart.Data(2012, 73));
        hyData.getData().add(new XYChart.Data(2013, 76));
        hyData.getData().add(new XYChart.Data(2014, 73));
        hyData.getData().add(new XYChart.Data(2015, 67));
        hyData.getData().add(new XYChart.Data(2016, 56));
        hyData.getData().add(new XYChart.Data(2017, 56));

        viivakaavio.getData().add(hyData);

        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch();
    }

}
