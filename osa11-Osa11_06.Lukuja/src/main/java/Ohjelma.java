
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Montako satunnailukua tulostetaan?");
        int maara = Integer.parseInt(lukija.nextLine());
        for (int i = 0; i < maara; i++) {
            // Arvotaan ja tulostetaan satunnainen luku
            int luku = random.nextInt(11);
            System.out.println(luku);
        }
    }

}
