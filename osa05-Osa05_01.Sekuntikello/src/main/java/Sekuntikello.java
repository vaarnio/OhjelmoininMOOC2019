public class Sekuntikello {
    private Viisari sekunnit;
    private Viisari sadasosat;

    public Sekuntikello(){
        this.sekunnit = new Viisari(60);
        this.sadasosat = new Viisari(100);
    }

    public String toString(){
        return(this.sekunnit + ":" + this.sadasosat);
    }

    public void etene(){
        sadasosat.etene();
        if(sadasosat.arvo() == 0){
            sekunnit.etene();
        }
    }
}
