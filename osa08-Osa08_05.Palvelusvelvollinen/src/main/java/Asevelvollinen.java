public class Asevelvollinen implements Palvelusvelvollinen {
    private int paivia;
    public Asevelvollinen(int paivia){
        this.paivia = paivia;
    }
    public int paiviaJaljella(){
        return this.paivia;
    }
    public void palvele(){
        if(this.paivia >= 1) {
            this.paivia--;
        }
    }
}
