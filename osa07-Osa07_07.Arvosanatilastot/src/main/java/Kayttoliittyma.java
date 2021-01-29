import java.util.ArrayList;
import java.util.Scanner;

public class Kayttoliittyma {
    private ArrayList<Integer> pisteet;
    private Scanner lukija;

    public Kayttoliittyma(ArrayList<Integer> pisteet, Scanner lukija){
        this.pisteet = pisteet;
        this.lukija = lukija;
    }

    public void kaynnista(){
        luePisteitä();
        Tilastotyokaluja tt = new Tilastotyokaluja(this.pisteet);
        System.out.println(tt.hyvaksytyt(this.pisteet));
        System.out.println("Pisteiden keskiarvo (kaikki): " + tt.keskiarvo());
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + tt.hyvaksyttyjenKeskiarvoToString());
        System.out.println("Hyvaksymisprosentti: " + tt.hyvaksymisprosentti());
        System.out.println("Arvosanajakauma:");
        tt.arvosanajakauma();
    }

    public void luePisteitä(){
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        while(true){
            int input = Integer.parseInt(this.lukija.nextLine());
            if(input == -1){
                break;
            }
            else if(input <= 100 && input >= 0){
                pisteet.add(input);
            }
        }
    }
}
