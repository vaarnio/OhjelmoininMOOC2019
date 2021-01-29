
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.eurot()+lisattava.eurot(), this.sentit()+lisattava.sentit());
        return uusi;
    }
    public boolean vahemman(Raha verrattava){
        if(this.eurot() < verrattava.eurot() || this.eurot() == verrattava.eurot() && this.sentit() < verrattava.sentit()){
            return true;
        }
        return false;
    }
    public Raha miinus(Raha vahentaja){
        if(this.eurot()<vahentaja.eurot() || this.eurot()==vahentaja.eurot() && this.sentit() < vahentaja.sentit()){
            return new Raha(0,0);
        } else {
            if(this.sentit()<vahentaja.sentit()){
                return new Raha(this.eurot()-vahentaja.eurot()-1, 100+this.sentit()-vahentaja.sentit());
            }
            return new Raha(this.eurot()-vahentaja.eurot(), this.sentit()-vahentaja.sentit());
        }
    }
}
