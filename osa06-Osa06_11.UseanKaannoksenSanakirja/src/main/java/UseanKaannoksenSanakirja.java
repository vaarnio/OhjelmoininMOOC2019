import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList> sanakirja = new HashMap<>();

    public void lisaa(String sana, String kaannos){
        if(sanakirja.containsKey(sana)){
            sanakirja.get(sana).add(kaannos);
        } else {
            sanakirja.put(sana, new ArrayList());
            sanakirja.get(sana).add(kaannos);
        }
    }
    public ArrayList<String> kaanna(String sana){
        if(sanakirja.containsKey(sana)) {
            return sanakirja.get(sana);
        } else {
            return new ArrayList<>();
        }
    }
    public void poista(String sana){
        if(sanakirja.containsKey(sana)){
            sanakirja.remove(sana);
        }
    }

}
