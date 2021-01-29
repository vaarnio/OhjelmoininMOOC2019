package sovellus;

public class Vakiosensori implements Sensori{
    private int arvo;

    public Vakiosensori(int luku){
        this.arvo = luku;
    }

    public boolean onPaalla(){
        return true;
    }

    public void paalle(){

    }

    public void poisPaalta(){

    }

    public int mittaa(){
        return this.arvo;
    }
}
