package maatila;

import java.util.Random;

import static java.lang.Math.ceil;

public class Lehma implements Lypsava, Eleleva {
    private String nimi;
    private int utareidenTilvauus;
    private double maara;
    private static final String[] NIMIA = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Lehma(){
        this.nimi = NIMIA[new Random().nextInt(NIMIA.length)];
        this.utareidenTilvauus = 15 + new Random().nextInt(26);
    }
    public Lehma(String nimi){
        this.nimi = nimi;
        this.utareidenTilvauus = 15 + new Random().nextInt(26);
    }

    public String getNimi() {
        return nimi;
    }

    public double getTilavuus() {
        return utareidenTilvauus*1.0;
    }

    public double getMaara() {
        return maara;
    }

    @Override
    public double lypsa() {
        double maaraEnnen = this.maara;
        this.maara = 0;
        return maaraEnnen;
    }

    @Override
    public void eleleTunti() {
        this.maara = this.maara + 0.7 + (2.0 - 0.7) * new Random().nextDouble();
        if(this.maara > this.utareidenTilvauus){
            this.maara = this.utareidenTilvauus;
        }
    }

    @Override
    public String toString(){
        return this.nimi + " " + ceil(this.maara) + "/" + ceil(this.utareidenTilvauus);
    }
}
