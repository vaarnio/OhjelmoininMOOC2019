public class Sailio {
    private int nestemaara;
    public Sailio(){
    }
    public int sisalto(){
        return this.nestemaara;
    }
    public String toString(){
        return this.nestemaara + "/100";
    }
    public void lisaa(int maara){
        if(maara <= 0){
            return;
        }
        this.nestemaara = this.nestemaara + maara;
        if(this.nestemaara > 100){
            this.nestemaara = 100;
        }
    }
    public void poista(int maara){
        if(maara <= 0){
            return;
        }
        this.nestemaara = this.nestemaara - maara;
        if(this.nestemaara < 0){
            this.nestemaara = 0;
        }
    }
}
