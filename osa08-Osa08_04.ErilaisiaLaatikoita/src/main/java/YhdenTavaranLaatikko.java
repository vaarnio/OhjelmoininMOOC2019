import java.util.ArrayList;

public class YhdenTavaranLaatikko extends Laatikko {
    private ArrayList<Tavara> sisalto;

    public YhdenTavaranLaatikko(){
        sisalto = new ArrayList<>();
    }

    public void lisaa(Tavara tavara){
        if(this.sisalto.size() == 0){
            this.sisalto.add(tavara);
        }
    }
    public boolean onkoLaatikossa(Tavara tavara){
        if(this.sisalto.contains(tavara)){
            return true;
        }
        return false;
    }
}
