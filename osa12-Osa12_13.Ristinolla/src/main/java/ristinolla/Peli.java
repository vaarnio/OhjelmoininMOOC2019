package ristinolla;

import java.util.Arrays;

public class Peli {
    private int[] pelilauta;
    private int koko;
    private int vuoro;

    public Peli(){
        this.pelilauta = new int[9];
        Arrays.fill(this.pelilauta, 2); //täytetään lauta kakkosilla default nollan sijaan
        this.koko = 3;
        this.vuoro = 1;
    }

    public void tulostaLauta(){
        System.out.println(this.pelilauta);
    }

    public int getKoko(){
        return this.koko;
    }

    public void setVuoro(int vuoro){
        this.vuoro = vuoro;
    }

    public int getVuoro(){
        return this.vuoro;
    }

    public void aloita(){

    }

    public void asetaLaudalle(int merkki, int kohta){
        this.pelilauta[kohta] = merkki;
    }

    public boolean kohtaTyhja(int kohta){
        if(this.pelilauta[kohta] == 2){
            return true;
        } else {
            return false;
        }
    }

    public boolean voittiko(int puoli){
        int[] pl = this.pelilauta;
        if(
            //vaakataso
            pl[0] == puoli && pl[1] == puoli && pl[2] == puoli ||
            pl[3] == puoli && pl[4] == puoli && pl[5] == puoli ||
            pl[6] == puoli && pl[7] == puoli && pl[8] == puoli ||
            //pysty
            pl[0] == puoli && pl[3] == puoli && pl[6] == puoli ||
            pl[1] == puoli && pl[4] == puoli && pl[7] == puoli ||
            pl[2] == puoli && pl[5] == puoli && pl[8] == puoli ||
            //viisto
            pl[0] == puoli && pl[4] == puoli && pl[8] == puoli ||
            pl[2] == puoli && pl[4] == puoli && pl[6] == puoli
        ){ return true; } else { return false; }
    }
}
