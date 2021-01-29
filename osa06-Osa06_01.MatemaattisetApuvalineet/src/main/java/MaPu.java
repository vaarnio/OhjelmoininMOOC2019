
import java.util.ArrayList;

public class MaPu {

    // toteuta apumetodit tänne
    public static double keskiarvo(ArrayList<Integer> luvut){
        double summa = 0;
        for (int i:luvut){
            summa = summa + i;
        }
        double keskiarvo = summa/luvut.size();
        return keskiarvo;
    }
}
