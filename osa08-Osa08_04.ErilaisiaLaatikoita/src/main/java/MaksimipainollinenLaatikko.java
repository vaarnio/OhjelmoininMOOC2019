import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko {
    private int maksimipaino;
    private ArrayList<Tavara> sisalto;

    public MaksimipainollinenLaatikko(int maksimipaino){
        this.maksimipaino = maksimipaino;
        this.sisalto = new ArrayList<>();
    }
    public void lisaa(Tavara tavara){
        if(tavara.getPaino() + yhteispaino() <= this.maksimipaino){
            sisalto.add(tavara);
        }
    }
    public boolean onkoLaatikossa(Tavara tavara){
        for(Tavara i:sisalto){
            if(i.equals(tavara)){
                return true;
            }
        }
        return false;
    }
    private int yhteispaino(){
        int summa = 0;
        for(Tavara i:sisalto){
            summa = summa + i.getPaino();
        }
        return summa;
    }
}
