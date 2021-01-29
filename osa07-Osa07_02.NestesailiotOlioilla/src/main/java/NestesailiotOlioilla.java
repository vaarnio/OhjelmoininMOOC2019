
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();

        while (true) {
            //määrien tulostelut
            System.out.println("Ensimmainen: " + ensimmainen.toString());
            System.out.println("Toinen: " + toinen.toString());

            //input and command parsing
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);

            //komennot
            if (komento.equals("lisaa")) {
                ensimmainen.lisaa(maara);
            } else if (komento.equals("siirra")) {
                if (maara <= 0) {
                    continue;
                }
                if(ensimmainen.sisalto() - maara < 0){
                    maara = ensimmainen.sisalto() - maara + maara;
                }
                ensimmainen.poista(maara);
                toinen.lisaa(maara);
            } else if (komento.equals("poista")) {
                toinen.poista(maara);
            }
        }

    }
}
