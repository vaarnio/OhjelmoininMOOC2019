
import java.util.ArrayList;
import java.util.HashMap;

public class Arvosanarekisteri {

    private HashMap<Integer, Integer> arvosanat;
    private ArrayList<Integer> pisteLista = new ArrayList<>();

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        int arvosana = pisteetArvosanaksi(pisteet);
        this.pisteLista.add(pisteet);

        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }


    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    public double koepisteidenKeskiarvo(){
        int summa = 0;
        for(int i:pisteLista){
            summa = summa + i;
        }
        return 1.0*summa/pisteLista.size();
    }
    public double arvosanojenKeskiarvo(){
        int summa = 0;
        int count = 0;
        for(int i:arvosanat.keySet()){
            summa = summa + i*arvosanat.get(i);
            count = count + arvosanat.get(i);
        }
        return 1.0*summa/count;
    }
}
