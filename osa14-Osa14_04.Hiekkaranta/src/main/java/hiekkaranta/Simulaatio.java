package hiekkaranta;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulaatio {
    Tyyppi[][] tyyppi;
    int leveys;
    int korkeus;

    public Simulaatio(int leveys, int korkeus) {
        this.korkeus = korkeus;
        this.leveys = leveys;
        this.tyyppi = new Tyyppi[leveys][korkeus];
        for(int i = 0; i < this.leveys; i++){
            for(int j = 0; j < this.korkeus; j++){
                this.tyyppi[i][j] = Tyyppi.TYHJA;
            }
        }
    }

    public void lisaa(int x, int y, Tyyppi tyyppi) {
        try {
            this.tyyppi[x][y] = tyyppi;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Tyyppi sisalto(int x, int y) {
        if(x < 0 || y < 0){
            return Tyyppi.METALLI;
        }
        if(x > tyyppi.length -1 || y > tyyppi[x].length -1){
            return Tyyppi.METALLI;
        }
        return this.tyyppi[x][y];
    }

    public void siirra(int xVanha, int yVanha, int xUus, int yUus){
        Tyyppi aine = this.tyyppi[xVanha][yVanha];
        this.tyyppi[xVanha][yVanha] = Tyyppi.TYHJA;
        this.tyyppi[xUus][yUus] = aine;
    }

    public void vaihdaPaikkaa(int xVanha, int yVanha, int xUus, int yUus){
        Tyyppi aineEka = this.tyyppi[xVanha][yVanha];
        Tyyppi aineToka = this.tyyppi[xUus][yUus];
        this.tyyppi[xVanha][yVanha] = aineToka;
        this.tyyppi[xUus][yUus] = aineEka;
    }

    public void paivita() {
        for(int i = 0; i < this.leveys; i++){
            for(int j = 0; j < this.korkeus; j++){
                if(tyyppi[i][j] == Tyyppi.HIEKKA){
                    //System.out.println("on hiekkaa");
                    List<Piste> vapaat = new ArrayList<>();
                    for(int x = -1 ; x <= 1 ; x++){
                        if(i + x < 0 || j + 1 < 0){
                            continue;
                        }
                        if(i + x > tyyppi.length -1 || j + 1 > tyyppi[i +x].length -1){
                            continue;
                        }
                        //System.out.println(this.tyyppi[i+x][j+1]);
                        if(this.tyyppi[i+x][j+1] == Tyyppi.TYHJA){
                            vapaat.add(new Piste(i+x, j+1, Tyyppi.TYHJA));
                            //System.out.println("lisättiin vapaa");
                        } else if(this.tyyppi[i+x][j+1] == Tyyppi.VESI){
                            vapaat.add(new Piste(i+x, j+1, Tyyppi.VESI));
                            //System.out.println("lisättiin vapaa");
                        }
                    }
                    if(vapaat.size() == 0){
                        continue;
                    } else if(vapaat.size() == 1) {
                        if(vapaat.get(0).getTyyppi() == Tyyppi.VESI){
                            vaihdaPaikkaa(i, j, vapaat.get(0).getX(), vapaat.get(0).getY());
                        } else if(vapaat.get(0).getTyyppi() == Tyyppi.TYHJA){
                            siirra(i, j, vapaat.get(0).getX(), vapaat.get(0).getY());
                        }
                    } else {
                        Random r = new Random();
                        int kohta = r.nextInt(vapaat.size());
                        if(vapaat.get(0).getTyyppi() == Tyyppi.VESI){
                            vaihdaPaikkaa(i,j,vapaat.get(kohta).getX(),vapaat.get(kohta).getY());
                        } else if (vapaat.get(0).getTyyppi() == Tyyppi.TYHJA) {
                            siirra(i, j, vapaat.get(kohta).getX(), vapaat.get(kohta).getY());
                        }
                    }

                }
                if(tyyppi[i][j] == Tyyppi.VESI){
                    List<Piste> vapaat = new ArrayList<>();
                    List<Piste> vapaatSivuilla = new ArrayList<>();
                    for(int x = -1 ; x <= 1 ; x++){
                        if(i + x < 0 || j + 1 < 0 || i == 0 && j == 0){
                            continue;
                        }
                        if(i + x > tyyppi.length -1 || j + 1 > tyyppi[i +x].length -1){
                            continue;
                        }
                        if(this.tyyppi[i+x][j+1] == Tyyppi.TYHJA){
                            vapaat.add(new Piste(i+x, j+1, Tyyppi.TYHJA));
                            //System.out.println("lisättiin vapaa");
                        }
                        if(this.tyyppi[i+x][j] == Tyyppi.TYHJA){
                            vapaatSivuilla.add(new Piste(i+x, j, Tyyppi.TYHJA));
                            //System.out.println("lisättiin vapaa");
                        }
                    }
                    if(vapaat.size() == 0){
                        if(vapaatSivuilla.size() == 2){
                            Random r = new Random();
                            int kohta = r.nextInt(vapaatSivuilla.size());
                            siirra(i, j, vapaatSivuilla.get(kohta).getX(), vapaatSivuilla.get(kohta).getY());
                        } else if (vapaatSivuilla.size() == 1) {
                            siirra(i, j, vapaatSivuilla.get(0).getX(), vapaatSivuilla.get(0).getY());
                        } else {
                            break;
                        }
                    } else if(vapaat.size() == 1) {
                        siirra(i,j,vapaat.get(0).getX(),vapaat.get(0).getY());
                    } else {
                        Random r = new Random();
                        int kohta = r.nextInt(vapaat.size());
                        siirra(i,j,vapaat.get(kohta).getX(),vapaat.get(kohta).getY());
                    }
                }
            }
        }
    }

}
