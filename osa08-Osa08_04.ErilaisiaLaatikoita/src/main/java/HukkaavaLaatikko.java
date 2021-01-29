import java.util.ArrayList;

public class HukkaavaLaatikko extends Laatikko {
    private ArrayList<Tavara> sisalto;

    public HukkaavaLaatikko(){
        sisalto = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        sisalto.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        try {
            for(Tavara i:sisalto){
                if(i.equals(tavara)){
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
