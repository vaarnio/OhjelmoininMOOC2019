
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        ArrayList<Integer> pisterekisteri = new ArrayList<>();
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(pisterekisteri, lukija);

        kayttoliittyma.kaynnista();
    }
}
