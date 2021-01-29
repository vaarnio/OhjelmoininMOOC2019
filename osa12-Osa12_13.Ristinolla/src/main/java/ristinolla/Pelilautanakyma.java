package ristinolla;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class Pelilautanakyma {
    private Peli peli;
    private List<Nappi> napit;
    private Label vuoro;

    public Pelilautanakyma(Peli peli, Label vuoro){
        this.vuoro = vuoro;
        this.peli = peli;
        this.napit = new ArrayList<>();
        for(int i = 0; i < peli.getKoko() * peli.getKoko(); i++){
            this.napit.add(new Nappi(i, peli, this.vuoro));
        }
    }

    public Parent getNakyma(){
        GridPane asettelu = new GridPane();

        asettelu.add(this.napit.get(0).getButton(),0,0);
        asettelu.add(this.napit.get(1).getButton(),1,0);
        asettelu.add(this.napit.get(2).getButton(),2,0);
        asettelu.add(this.napit.get(3).getButton(),0,1);
        asettelu.add(this.napit.get(4).getButton(),1,1);
        asettelu.add(this.napit.get(5).getButton(),2,1);
        asettelu.add(this.napit.get(6).getButton(),0,2);
        asettelu.add(this.napit.get(7).getButton(),1,2);
        asettelu.add(this.napit.get(8).getButton(),2,2);

        return asettelu;
    }
}
