package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori{
    private boolean tila;

    public Lampomittari(){
        this.tila = false;
    }

    public boolean onPaalla(){
        return this.tila;
    }

    public void paalle(){
        this.tila = true;
    }

    public void poisPaalta(){
        this.tila = false;
    }

    public int mittaa(){
        return new Random().nextInt(61) - 30;
    }

}
