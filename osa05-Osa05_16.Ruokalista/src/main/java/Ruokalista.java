
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    // toteuta tänne tarvittavat metodit

    public void lisaaAteria(String ateria) {
        if (!(ateriat.contains(ateria))) {
            ateriat.add(ateria);
        }
    }
    public void tulostaAteriat(){
        for(String i:ateriat){
            System.out.println(i);
        }
    }
    public void tyhjennaRuokalista(){
        ateriat.clear();
    }
}
