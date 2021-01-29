
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        //sailiot
        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            //määrien tulostelut
            System.out.println("Ensimmainen: " + ensimmainen + "/100");
            System.out.println("Toinen: " + toinen + "/100");

            //input and command parsing
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] osat = luettu.split(" ");
            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);

            //komennot
            if (komento.equals("lisaa")){
                if(maara <= 0){
                    continue;
                }
                ensimmainen = ensimmainen + maara;
                if (ensimmainen > 100){
                    ensimmainen = 100;
                }
            }
            else if (komento.equals("siirra")){
                if(maara <= 0){
                    continue;
                }
                ensimmainen = ensimmainen - maara;
                if(ensimmainen < 0){
                    maara = ensimmainen + maara;
                    ensimmainen = 0;
                }
                toinen = toinen + maara;
                if (toinen > 100){
                    toinen = 100;
                }
            }
            else if (komento.equals("poista")){
                if(maara <= 0){
                    continue;
                }
                toinen = toinen - maara;
                if (toinen < 0){
                    toinen = 0;
                }
            }
        }
    }

}
