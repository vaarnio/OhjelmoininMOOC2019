package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.File;
import java.util.*;

public class PuolueetSovellus extends Application {

    public void start(Stage ikkuna){
        NumberAxis xAkseli = new NumberAxis(1968, 2009, 4);
        NumberAxis yAkseli = new NumberAxis();

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli,yAkseli);
        viivakaavio.setTitle("Puolueiden suhteellinen kannatus");

        Map<String, Map<Integer, Double>> arvot = new HashMap();

        try {
            Scanner tiedostoLukija = new Scanner(new File("puoluedata.tsv"));

            List<Integer> vuodet = new ArrayList<>();

            boolean eka = true;
            while(tiedostoLukija.hasNextLine()){
                System.out.println(eka);
                if(eka){
                    for(String vuosi : tiedostoLukija.nextLine().split("\t")){
                        if(vuosi.equals("Puolue")){
                            continue;
                        }
                        vuodet.add(Integer.parseInt(vuosi));
                    }
                    eka = false;
                    continue;
                }
                String[] palat = tiedostoLukija.nextLine().split("\t");
                String key = palat[0];
                arvot.put(key, new HashMap<>());

                int moneskoPala = 1;
                while(moneskoPala < palat.length){
                    if(palat[moneskoPala].equals("-")){
                        moneskoPala++;
                        continue;
                    }
                    arvot.get(key).put(vuodet.get(moneskoPala - 1), Double.parseDouble(palat[moneskoPala]));
                    moneskoPala++;
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }



        XYChart.Series puolueData = new XYChart.Series();

        arvot.keySet().stream().forEach(puolue -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(puolue);

            arvot.get(puolue).entrySet().stream().forEach(pari -> {
                data.getData().add(new XYChart.Data(pari.getKey(), pari.getValue()));
            });

            viivakaavio.getData().add(data);
        });

        Scene nakyma = new Scene(viivakaavio, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch();
    }

}