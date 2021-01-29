package maatila;

import java.util.ArrayList;
import java.util.List;

public class Maatila implements Eleleva{
    private List<Lehma> lehmaList;
    private Navetta navetta;
    private String omistaja;

    public Maatila(String omistaja, Navetta navetta){
        this.lehmaList = new ArrayList<>();
        this.navetta = navetta;
        this.omistaja = omistaja;
    }

    public void lisaaLehma(Lehma lehma){
        this.lehmaList.add(lehma);
    }

    @Override
    public void eleleTunti() {
        for(Lehma lehma : lehmaList){
            lehma.eleleTunti();
        }
    }

    public String getOmistaja() {
        return omistaja;
    }

    public void asennaNavettaanLypsyrobotti(Lypsyrobotti lypsyrobotti){
        this.navetta.asennaLypsyrobotti(lypsyrobotti);
    }

    public void hoidaLehmat(){
        this.navetta.hoida(this.lehmaList);
    }

    @Override
    public String toString() {
        String lehmat = "";
        for(Lehma lehma : lehmaList){
            lehmat = lehmat + lehma.toString() + "\n";
        }
        return "Maatilan omistaja: " + this.omistaja + "\n" + "Navetan maitosäiliö: " + this.navetta.toString() + "\n" + lehmat;
    }
}
