package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {

        if (nimi == null || nimi.equals("") || nimi.length() > 40 || ika > 120 || ika < 0) {
            throw new IllegalArgumentException("Virheellinen syöte.");
        }

        this.nimi = nimi;
        this.ika = ika;


    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
