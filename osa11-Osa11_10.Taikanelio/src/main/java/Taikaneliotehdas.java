
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);

        // toteuta taikaneliön luominen Siamese method -algoritmilla tänne
        int keskipiste = nelio.getLeveys() / 2;
        int x = keskipiste;
        int y = 0; //käänteinen
        nelio.asetaArvo(x, y, 1);
        for(int indeksi = 2; indeksi <= koko*koko; indeksi++){
            //liiku "oikealle"
            x = x + 1;

            if(x >= koko){
                x = 0;
            }
            if(x < 0){
                x = koko -1;
            }

            //liiku "ylös"
            y = y - 1;

            if(y >= koko){
                y = 0;
            }
            if(y < 0){
                y = koko -1;
            }

            //aseta arvo tai siirry ala jos kohdassa on jo arvo
            if(nelio.annaArvo(x, y) == 0){
                nelio.asetaArvo(x, y, indeksi);
            } else {
                x = x - 1;
                y = y +1;
                if(x >= koko){
                    x = 0;
                }
                if(x < 0){
                    x = koko -1;
                }
                if(y >= koko){
                    y = 0;
                }
                if(y < 0){
                    y = koko -1;
                }
                y = y + 1;
                if(y >= koko){
                    y = 0;
                }
                if(y < 0){
                    y = koko -1;
                }
                nelio.asetaArvo(x, y, indeksi);
            }
        }

        return nelio;
    }

}
