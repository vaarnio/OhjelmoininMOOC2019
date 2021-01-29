import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Tilastotyokaluja {
    private ArrayList<Integer> pisteet;

    public Tilastotyokaluja(ArrayList<Integer> pisteet){
        this.pisteet = pisteet;
    }

    public Double keskiarvo(){
        return 1.0 * summa(this.pisteet) / this.pisteet.size();
    }

    public Double hyvaksyttyjenKeskiarvo(){
        ArrayList<Integer> hyvaksytyt = hyvaksytyt(this.pisteet);
        if(hyvaksytyt.isEmpty()){
            return -1.0;
        }
        return 1.0 * summa(hyvaksytyt) / hyvaksytyt.size();
    }

    public String hyvaksyttyjenKeskiarvoToString(){
        Double keskiarvo = hyvaksyttyjenKeskiarvo();
        if(keskiarvo == -1){
            return "-";
        } else {
            return Double.toString(keskiarvo);
        }
    }

    public Double hyvaksymisprosentti(){
        int hyvaksytyt = hyvaksytyt(this.pisteet).size();
        return 100.0 * hyvaksytyt / this.pisteet.size();
    }
    public void arvosanajakauma(){
        String[] jakauma = new String[6];
        for (int i:this.pisteet) {
            if(i<50){
                jakauma[0] = jakauma[0] + "*";
            }
            else if(i<60){
                jakauma[1] = jakauma[1] + "*";
            }
            else if(i<70){
                jakauma[2] = jakauma[2] + "*";
            }
            else if(i<80){
                jakauma[3] = jakauma[3] + "*";
            }
            else if(i<90){
                jakauma[4] = jakauma[4] + "*";
            }
            else if(i>=90){
                jakauma[5] = jakauma[5] + "*";
            }
        }
        int index = 5;
        for (String jakaumanOsa:jakauma) {
            try {
                System.out.println(index + ": " + jakauma[index].substring(4));
            } catch (Exception e) {
                System.out.println(index + ": ");
            }
            index--;
        }
    }

    public int summa(ArrayList<Integer> summattavat){
        int summa = 0;
        for(int i:summattavat){
            summa = summa + i;
        }
        return summa;
    }

    public ArrayList<Integer> hyvaksytyt(ArrayList<Integer> pisteet){
        ArrayList<Integer> hyvaksytyt = new ArrayList<>();
        for (int i:pisteet) {
            if(i>=50){
                hyvaksytyt.add(i);
            }
        }
        return hyvaksytyt;
    }
}
