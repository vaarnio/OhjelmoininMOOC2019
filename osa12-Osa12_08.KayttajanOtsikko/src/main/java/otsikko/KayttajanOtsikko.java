package otsikko;


import java.util.Scanner;

public class KayttajanOtsikko{
    Scanner lukija;

    public KayttajanOtsikko(){
        this.lukija = new Scanner(System.in);
    }

    public String kysy(){
        System.out.print("Anna ikkunalle otsikko: ");
        return this.lukija.nextLine();
    }
}
