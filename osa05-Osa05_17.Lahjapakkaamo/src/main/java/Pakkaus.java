import java.util.ArrayList;

public class Pakkaus {
    private ArrayList<Lahja> lahjat = new ArrayList<>();

    public Pakkaus(){

    }

    public void lisaaLahja(Lahja lahja){
        lahjat.add(lahja);
    }
    public int yhteispaino(){
        int yhteispaino = 0;
        for(Lahja i:lahjat){
            yhteispaino = yhteispaino + i.getPaino();
        }
        return yhteispaino;
    }
}
