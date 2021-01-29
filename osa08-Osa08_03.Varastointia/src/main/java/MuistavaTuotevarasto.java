public class MuistavaTuotevarasto extends Tuotevarasto {
    private Muutoshistoria muutoshistoria;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo){
        super(tuotenimi,tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        muutoshistoria.lisaa(alkuSaldo);
    }

    public String historia(){
        return muutoshistoria.toString();
    }

    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        muutoshistoria.lisaa(super.getSaldo());
    }

    public double otaVarastosta(double maara){
        double otettu = super.otaVarastosta(maara);
        muutoshistoria.lisaa(super.getSaldo());
        return otettu;
    }

    public void tulostaAnalyysi(){
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + muutoshistoria.toString());
        System.out.println("Suurin tuotemäärä: " + muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: " + muutoshistoria.minArvo());
        System.out.println("Keskiarvo: " + muutoshistoria.keskiarvo());
    }
}
