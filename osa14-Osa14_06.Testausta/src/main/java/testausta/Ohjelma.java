package testausta;

import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println(suorita(lukija));
    }

    public static String suorita(Scanner lukija) {
        int pulloja = 0;
        int oppilaat = 0;
        while(lukija.hasNextLine()){
            String rivi = lukija.nextLine();
            if(rivi.equals("-1")){
                oppilaat = kysyOppilaat();
                break;
            }
            if(!rivi.startsWith("-")){
                pulloja += Integer.parseInt(rivi);
            }
        }
        if(pulloja == 0 || oppilaat == 0){
            return "Pulloja: " + pulloja + "\nOppilaita: " + oppilaat + "\nKeskiarvoa ei voida laskea";
        } else {
            double keskiarvo = pulloja*1.0/oppilaat;
            return "Pulloja: " + pulloja + "\nOppilaita: " + oppilaat + "\nKeskiarvo: " + keskiarvo;
        }


    }
    public static int kysyOppilaat(){
        System.out.println("Montako oppilasta oli keräämässä pulloja?");
        Scanner lukija2 = new Scanner(System.in);
        int oppilaat = Integer.parseInt(lukija2.nextLine());
        return oppilaat;
    }
}
