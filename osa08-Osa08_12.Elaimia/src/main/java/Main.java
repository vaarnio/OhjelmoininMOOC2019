
public class Main {

    public static void main(String[] args) {
        // voit kokeilla luomiesi luokkien toimintaa täällä
        Kissa kissa = new Kissa();
        kissa.mourua();
        kissa.syo();

        Kissa karvinen = new Kissa("Karvinen");
        karvinen.mourua();
        Koira koira = new Koira();
        koira.hauku();
        koira.syo();

        Koira nalle = new Koira("Nalle");
        nalle.hauku();
        koira.hauku();
        nalle.syo();
    }

}
