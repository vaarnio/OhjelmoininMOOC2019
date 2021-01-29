import java.util.ArrayList;
import java.util.HashMap;

public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat = new HashMap<>();

    public boolean lisaa(Rekisterinumero rekkari, String omistaja){
        if(omistajat.containsKey(rekkari)){
            return false;
        } else {
            omistajat.put(rekkari, omistaja);
            return true;
        }
    }
    public String hae(Rekisterinumero rekkari){
        if(omistajat.containsKey(rekkari)) {
            return omistajat.get(rekkari);
        } else {
            return null;
        }
    }
    public boolean poista(Rekisterinumero rekkari){
        if(omistajat.containsKey(rekkari)){
            omistajat.remove(rekkari);
            return true;
        } else {
            return false;
        }
    }
    public void tulostaRekisterinumerot(){
        for(Rekisterinumero i:omistajat.keySet()){
            System.out.println(i);
        }
    }
    public void tulostaOmistajat(){
        ArrayList<String> tulostetutNimet = new ArrayList<>();
        for(Rekisterinumero i:omistajat.keySet()){
            if(tulostetutNimet.contains(omistajat.get(i)) == false) {
                System.out.println(omistajat.get(i));
            }
            tulostetutNimet.add(omistajat.get(i));
        }
    }
}
