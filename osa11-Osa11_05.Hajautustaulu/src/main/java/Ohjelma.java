
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        Hajautustaulu taulu = new Hajautustaulu();
        taulu.lisaa("auto", "Opel");
        taulu.lisaa("moottoripyörä", "Ktm");
        System.out.println(taulu.hae("auto"));
        System.out.println(taulu.hae("moottoripyörä"));
        taulu.poista("auto");
        System.out.println(taulu.hae("auto"));
        taulu.lisaa("auto", "Opel");
        System.out.println(taulu.hae("auto"));
    }

}
