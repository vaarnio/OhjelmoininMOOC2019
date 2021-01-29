import java.util.ArrayList;

public class Putki<T> {
    ArrayList<T> lista;

    public Putki(){
        this.lista = new ArrayList<>();
    }

    public void lisaaPutkeen(T arvo){
        this.lista.add(arvo);
    }

    public T otaPutkesta(){
        if (onkoPutkessa()) {
            T arvo = this.lista.get(0);
            this.lista.remove(0);
            return arvo;
        } else {
            return null;
        }
    }

    public boolean onkoPutkessa(){
        if(this.lista.size() == 0){
            return false;
        } else {
            return true;
        }
    }
}
