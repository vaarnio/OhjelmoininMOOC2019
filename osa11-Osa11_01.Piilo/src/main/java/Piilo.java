public class Piilo<T> {
    private T olio;

    public Piilo(){
    }
    public void laitaPiiloon(T piilotettava){
        this.olio = piilotettava;
    }
    public T otaPiilosta(){
        if(this.onkoPiilossa() == false){
            return null;
        }
        T palautettava = this.olio;
        this.olio = null;
        return palautettava;
    }
    public boolean onkoPiilossa(){
        if(this.olio == null){
            return false;
        } else {
            return true;
        }
    }
}
