
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }

    public boolean suurempi(Asunto verrattava){
        if(this.nelioita>verrattava.nelioita){
            return true;
        } else {
            return false;
        }
    }
    public int hintaero(Asunto verrattava){
        int thisHinta = this.neliohinta*this.nelioita;
        int verrattavaHinta = verrattava.neliohinta*verrattava.nelioita;
        if(thisHinta <= verrattavaHinta){
            return verrattavaHinta-thisHinta;
        } else {
            return thisHinta-verrattavaHinta;
        }
    }
    public boolean kalliimpi(Asunto verrattava){
        int thisHinta = this.neliohinta*this.nelioita;
        int verrattavaHinta = verrattava.neliohinta*verrattava.nelioita;
        if(thisHinta <= verrattavaHinta){
            return false;
        } else {
            return true;
        }
    }

}
