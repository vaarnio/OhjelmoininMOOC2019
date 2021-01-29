package ristinolla;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Nappi {
    private Label vuoro;
    private Peli peli;
    private int puoli;
    private int napinNumero;
    private Button nappi;

    public Nappi(int numero, Peli peli, Label vuoro){
        this.peli = peli;
        this.vuoro = vuoro;
        this.napinNumero = numero;
        this.nappi = new Button();
        this.nappi.setOnAction(this::buttonHandler);
    }

    private void buttonHandler(ActionEvent event){
        if(this.peli.getVuoro() == 0 && this.peli.kohtaTyhja(this.napinNumero)){
            this.nappi.setText("O");
            this.peli.asetaLaudalle(0, this.napinNumero);
            if(this.peli.voittiko(0)){
                System.out.println(this.peli.voittiko(0));
                this.vuoro.setText("Loppu!");
                return;
            }
            this.peli.setVuoro(1);
            this.vuoro.setText("Vuoro: X");
        } else if(this.peli.kohtaTyhja(this.napinNumero)){
            this.nappi.setText("X");
            this.peli.asetaLaudalle(1, this.napinNumero);
            if(this.peli.voittiko(1)){
                System.out.println(this.peli.voittiko(1));
                this.vuoro.setText("Loppu!");
                return;
            }
            this.peli.setVuoro(0);
            this.vuoro.setText("Vuoro: O");
        }
    }

    public Button getButton(){
        return this.nappi;
    }
}
