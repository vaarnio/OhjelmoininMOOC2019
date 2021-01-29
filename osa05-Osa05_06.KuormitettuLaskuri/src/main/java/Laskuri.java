public class Laskuri {
    private int arvo;

    public Laskuri(int alkuarvo){
        this.arvo = alkuarvo;
    }
    public Laskuri(){
        this.arvo = 0;
    }
    public int arvo(){
        return this.arvo;
    }
    public void lisaa(){
        lisaa(1);
    }
    public void lisaa(int lisays){
        if(lisays>= 0) {
            this.arvo = this.arvo + lisays;
        }
    }
    public void vahenna(){
        this.vahenna(1);
    }
    public void vahenna(int vahennys){
        if(vahennys>= 0) {
            this.arvo = this.arvo - vahennys;
        }
    }
}
