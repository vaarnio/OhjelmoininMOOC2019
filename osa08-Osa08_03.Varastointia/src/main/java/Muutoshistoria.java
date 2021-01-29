import java.util.ArrayList;

public class Muutoshistoria {
    private ArrayList<Double> muutoshistoria;

    public Muutoshistoria(){
        this.muutoshistoria = new ArrayList<>();
    }
    public void lisaa(double tilanne){
        this.muutoshistoria.add(tilanne);
    }
    public void nollaa(){
        this.muutoshistoria.clear();
    }
    public String toString(){
        return this.muutoshistoria.toString();
    }
    public double maxArvo(){
        if(this.muutoshistoria.size()==0){
            return 0;
        }
        double suurin = this.muutoshistoria.get(0);
        for(double arvo:this.muutoshistoria){
            if(arvo > suurin){
                suurin = arvo;
            }
        }
        return suurin;
    }
    public double minArvo(){
        if(this.muutoshistoria.size()==0){
            return 0;
        }
        double pienin = this.muutoshistoria.get(0);
        for(double arvo:this.muutoshistoria){
            if(arvo < pienin){
                pienin = arvo;
            }
        }
        return pienin;
    }
    public double keskiarvo(){
        if(this.muutoshistoria.size()==0){
            return 0;
        }
        double summa = 0;
        for(double arvo:this.muutoshistoria){
            summa = summa + arvo;
        }
        return summa/this.muutoshistoria.size();
    }
}
