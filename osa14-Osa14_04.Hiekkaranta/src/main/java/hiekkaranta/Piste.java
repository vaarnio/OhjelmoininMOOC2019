package hiekkaranta;

public class Piste {
    private int x;
    private int y;
    private Tyyppi tyyppi;

    public Piste(int x, int y, Tyyppi tyyppi){
        this.x = x;
        this.y = y;
        this.tyyppi = tyyppi;
    }

    public int getX() {
        return x;
    }

    public Tyyppi getTyyppi() {
        return tyyppi;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return this.x + "," + this.y;
    }
}
