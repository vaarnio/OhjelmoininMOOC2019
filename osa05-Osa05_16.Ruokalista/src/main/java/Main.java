
public class Main {
    public static void main(String[] args) {
        Ruokalista exactum = new Ruokalista();
        
        // Kun olet luonut metodin lisaaAteria(String ateria), 
        // voit poistaa allaolevat kommentit
        
        exactum.lisaaAteria("Pariloitua lohta ja kuhaa, basilikalla maustettua valkoviinivoikastiketta.");
        exactum.lisaaAteria("Kesäinen vihersalaatti ja omena-hunajavinegretti.");
        exactum.lisaaAteria("Paahdettua karitsan seläkettä ja punaviinikastiketta.");
        
        exactum.tulostaAteriat();
        

        exactum.tyhjennaRuokalista();
        exactum.tulostaAteriat();
    }
}
