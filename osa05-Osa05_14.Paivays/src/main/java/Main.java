
public class Main {

    public static void main(String[] args) {
        // testaa luokkasi toimintaa täällä!
        Paivays nyt = new Paivays(13, 2, 2015);
        Paivays viikonPaasta = nyt;
        viikonPaasta.etene(7);

        System.out.println("Nyt: " + nyt);
        System.out.println("Viikon päästä: " + viikonPaasta);
    }
}
