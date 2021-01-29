import java.util.ArrayList;
import java.util.List;

public class Lauma implements Siirrettava {
    private List<Siirrettava> lauma;

    public Lauma(){
        this.lauma = new ArrayList<>();
    }

    public void lisaaLaumaan(Siirrettava siirrettava){
        this.lauma.add(siirrettava);
    }

    public void siirra(int dx, int dy){
        for(Siirrettava siirrettava : this.lauma){
            siirrettava.siirra(dx, dy);
        }
    }

    @Override
    public String toString() {
        String sijainnit = "";
        for(Siirrettava siirrettava : this.lauma){
            sijainnit = sijainnit + siirrettava.toString() + "\n";
        }
        return sijainnit;
    }
}
