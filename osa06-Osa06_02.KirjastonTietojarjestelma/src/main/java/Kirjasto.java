import java.lang.reflect.Array;
import java.util.ArrayList;

public class Kirjasto {
    private ArrayList<Kirja> kirjat;

    public Kirjasto(){
        this.kirjat = new ArrayList<>();
    }

    public void lisaaKirja(Kirja uusiKirja){
        this.kirjat.add(uusiKirja);
    }
    public void tulostaKirjat(){
        for(Kirja kirja:kirjat){
            System.out.println(kirja.toString());
        }
    }
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke){
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        // käy läpi kaikki kirjat ja lisää ne joilla haetun kaltainen nimeke listalle loydetyt
        for(Kirja kirja:this.kirjat){
            if(StringUtils.sisaltaa(kirja.nimeke(), nimeke)){
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija){
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        // käy läpi kaikki kirjat ja lisää ne joilla haetun kaltainen nimeke listalle loydetyt
        for(Kirja kirja:this.kirjat){
            if(StringUtils.sisaltaa(kirja.julkaisija(), julkaisija)){
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi){
        ArrayList<Kirja> loydetyt = new ArrayList<>();

        // käy läpi kaikki kirjat ja lisää ne joilla haetun kaltainen nimeke listalle loydetyt
        for(Kirja kirja:this.kirjat){
            if(kirja.julkaisuvuosi() == julkaisuvuosi){
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    }


}
