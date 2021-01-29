public class Opiskelija extends Henkilo {
    private int opintopisteet;

    public Opiskelija(String nimi, String osoite){
        super(nimi, osoite);
    }

    public void opiskele(){
        this.opintopisteet++;
    }

    public int opintopisteita(){
        return this.opintopisteet;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  opintopisteitä " + this.opintopisteet;
    }
}
