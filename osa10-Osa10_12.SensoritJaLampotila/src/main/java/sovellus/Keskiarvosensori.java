package sovellus;

import java.util.ArrayList;
import java.util.List;

public class Keskiarvosensori implements Sensori{
    private List<Sensori> sensorit;
    private ArrayList<Integer> arvot = new ArrayList<>();

    public Keskiarvosensori(){
        sensorit = new ArrayList<>();
    }

    public boolean onPaalla(){
        for(Sensori sensori : sensorit){
            if(sensori.onPaalla() == false){
                return false;
            }
        }
        return true;
    }

    public void paalle(){
        for(Sensori sensori : sensorit){
            sensori.paalle();
        }
    }

    public void poisPaalta(){
        for(Sensori sensori : sensorit){
            sensori.poisPaalta();
        }
    }

    public int mittaa(){
        int ka = sensorit.stream()
                .mapToInt(i -> i.mittaa())
                .sum() / sensorit.size();
        this.arvot.add(ka);
        return ka;
    }

    public void lisaaSensori(Sensori sensori){
        this.sensorit.add(sensori);
    }

    public List<Integer> mittaukset(){
        return this.arvot;
    }
}
