package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.2) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }

    public void kehity() {
        // säännöt kehittymiselle:

        // 1. jokainen elossa oleva alkio, jolla on alle 2 elossa olevaa naapuria kuolee
        // 2. jokainen elossa oleva alkio, jolla on 2 tai 3 elossa olevaa naapuria pysyy hengissä
        // 3. jokainen elossa oleva alkio, jolla on 4 tai enemmän naapureita kuolee
        // 4. jokainen kuollut alkio, jolla on tasan 3 naapuria muuttuu eläväksi
        // taulukossa arvo 1 kuvaa elävää alkiota, arvo 0 kuollutta alkiota
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];

        for(int x = 0 ; x < this.taulukko.length ; x++){
            for(int y = 0 ; y < this.taulukko.length ; y++){
                if(this.taulukko[x][y] == 1){
                    if(elossaOleviaNaapureita(this.taulukko, x, y) < 2){
                        kopio[x][y] = 0;
                    }
                    if(elossaOleviaNaapureita(this.taulukko, x, y) == 2 || elossaOleviaNaapureita(this.taulukko, x, y) == 3){
                        kopio[x][y] = 1;
                    }
                    if(elossaOleviaNaapureita(this.taulukko, x, y) > 3){
                        kopio[x][y] = 0;
                    }
                }
                if(this.taulukko[x][y] == 0 && elossaOleviaNaapureita(this.taulukko, x, y) == 3){
                    kopio[x][y] = 1;
                }
            }
        }
        this.taulukko = kopio;
    }

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int elossa = 0;

        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(i + x < 0 || j + y < 0){
                    continue;
                }
                if(i + x > taulukko.length -1 || j + y > taulukko[i +x].length -1){
                    continue;
                }
                if(i == 0 && j == 0){
                    continue;
                }
                if (taulukko[x + i][y + j] == 1) {
                        elossa++;
                }
            }
        }

        return elossa;
    }
}
