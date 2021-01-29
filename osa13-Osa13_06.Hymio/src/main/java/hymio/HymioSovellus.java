package hymio;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.awt.*;

public class HymioSovellus extends Application{

    public void start(Stage ikkuna){
        BorderPane asettelu = new BorderPane();
        Canvas kangas = new Canvas(640, 640);
        GraphicsContext piirtaja = kangas.getGraphicsContext2D();

        piirtaja.setFill(Paint.valueOf("black"));

        piirtaja.fillRect(100,0,100,100);
        piirtaja.fillRect(400,0,100,100);
        piirtaja.fillRect(0,300,100,100);
        piirtaja.fillRect(100,400,400,100);
        piirtaja.fillRect(500,300,100,100);

        asettelu.setCenter(kangas);
        ikkuna.setScene(new Scene(asettelu));
        ikkuna.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch();
    }

}
