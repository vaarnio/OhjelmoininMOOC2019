package mooc.logiikka;

import mooc.ui.Kayttoliittyma;

public class Sovelluslogiikka {
    private Kayttoliittyma kayttoliittyma;

    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma){
        this.kayttoliittyma = kayttoliittyma;
    }

    public void suorita(int montaKertaa){
        int index = 1;
        while(index <= montaKertaa){
            System.out.println("Sovelluslogiikka toimii");
            this.kayttoliittyma.paivita();
            index++;
        }
    }
}
