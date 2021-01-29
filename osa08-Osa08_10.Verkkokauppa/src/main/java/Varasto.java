import java.util.*;

public class Varasto {
    private Map<String, Integer> varasto;
    private Map<String, Integer> varastosaldo;

    public Varasto(){
        this.varasto = new HashMap<>();
        this.varastosaldo = new HashMap<>();
    }
    public int saldo(String tuote){
        if(this.varastosaldo.containsKey(tuote)){
            return this.varastosaldo.get(tuote);
        }
        else {
            return 0;
        }
    }
    public Set<String> tuotteet(){
        Set<String> palautusjoukko = new HashSet<>();
        for (String tuote : this.varasto.keySet()){
            if(this.varastosaldo.get(tuote) > 0){
                palautusjoukko.add(tuote);
            }
        }
        return palautusjoukko;
    }
    public boolean ota(String tuote){
        if(this.varastosaldo.containsKey(tuote) && this.varastosaldo.get(tuote) >0){
            this.varastosaldo.put(tuote, this.varastosaldo.get(tuote) -1);
            return true;
        }
        return false;
    }
    public void lisaaTuote(String tuote, int hinta, int saldo){
        this.varasto.put(tuote, hinta);
        this.varastosaldo.put(tuote, saldo);
    }
    public int hinta(String tuote){
        if (varasto.containsKey(tuote)){
            return this.varasto.get(tuote);
        } else {
            return -99;
        }
    }
}
