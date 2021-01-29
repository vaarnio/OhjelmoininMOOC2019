import java.util.ArrayList;

public class Laatikko implements Talletettava{
    private double maksimipaino;
    private ArrayList<Talletettava> talletettavat;
    
    public Laatikko(double maksimipaino){
        this.maksimipaino = maksimipaino;
        talletettavat = new ArrayList<>();
    }

    public void lisaa(Talletettava tavara){
        if(this.paino() + tavara.paino() <= this.maksimipaino){
            talletettavat.add(tavara);
        }
    }

    public double paino(){
        double summa = 0;
        for(Talletettava i : talletettavat){
            summa = summa + i.paino();
        }
        return summa;
    }

    @Override
    public String toString() {
        return "Laatikko: " + this.talletettavat.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }
}
