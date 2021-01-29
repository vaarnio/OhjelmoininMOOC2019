
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
        int lukuja = 0;
        Random random = new Random();
        while(lukuja < 7){
            int numero = random.nextInt(40) + 1;
            if(!this.sisaltaaNumeron(numero)){
                this.numerot.add(numero);
                lukuja++;
            }
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        if(this.numerot.contains(numero)){
            return true;
        }
        return false;
    }
}
