import java.util.ArrayList;
import java.util.List;

public class Ostoskori {
    private List<Ostos> ostokset;

    public Ostoskori(){
        this.ostokset = new ArrayList<>();
    }
    public void lisaa(String tuote, int hinta){
        for(Ostos ostos : this.ostokset){
            if(ostos.toString().startsWith(tuote + ":")){
                ostos.kasvataMaaraa();
                return;
            }
        }
        this.ostokset.add(new Ostos(tuote, 1, hinta));
    }
    public int hinta(){
        int summa = 0;
        for(Ostos ostos : this.ostokset){
            summa = summa + ostos.hinta();
        }
        return summa;
    }
    public void tulosta(){
        for(Ostos ostos : this.ostokset){
            System.out.println(ostos.toString());
        }
    }
}
