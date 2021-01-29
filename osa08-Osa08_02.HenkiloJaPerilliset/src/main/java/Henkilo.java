public class Henkilo {
    private String nimi;
    private String osoite;

    public Henkilo(){
        this.nimi = "esimerkki";
    }

    public Henkilo(String nimi, String osoite){
        this.nimi = nimi;
        this.osoite = osoite;
    }

    public String toString(){
        return this.nimi + "\n  " + this.osoite;
    }
}
