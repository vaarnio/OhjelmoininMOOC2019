import java.util.ArrayList;
import java.util.HashMap;

public class Kellari {
    private HashMap<String, ArrayList> kellari = new HashMap<>();

    public void lisaa(String komero, String tavara){
        if(this.kellari.containsKey(komero)){
            this.kellari.get(komero).add(tavara);
        } else {
            this.kellari.put(komero, new ArrayList<String>());
            this.kellari.get(komero).add(tavara);
        }
    }
    public ArrayList<String> sisalto(String komero){
        if(this.kellari.containsKey(komero)){
            return this.kellari.get(komero);
        } else {
            return new ArrayList<String>();
        }
    }
    public void poista(String komero, String tavara){
        if(this.kellari.containsKey(komero)){
            if(this.kellari.get(komero).contains(tavara)){
                this.kellari.get(komero).remove(tavara);
            }
            if(this.kellari.get(komero).size()==0){
                kellari.remove(komero);
            }
        }
    }
    public ArrayList<String> komerot(){
        ArrayList<String> lista = new ArrayList<>();
        for(String komero:this.kellari.keySet()){
            if(this.kellari.get(komero).size()!=0){
                lista.add(komero);
            }
        }
        return lista;
    }
}
