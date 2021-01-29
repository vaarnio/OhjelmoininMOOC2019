package lentokentta;


import lentokentta.logiikka.Lentohallinta;
import lentokentta.ui.Tekstikayttoliittyma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lentohallinta lentohallinta = new Lentohallinta();
        Tekstikayttoliittyma tekstikayttoliittyma = new Tekstikayttoliittyma(lentohallinta, lukija);
        tekstikayttoliittyma.kaynnista();
    }
}
