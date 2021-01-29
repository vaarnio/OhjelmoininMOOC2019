public class Harjoitusapuri {
    private int ika;
    private int leposyke;
    public Harjoitusapuri(int ika, int leposyke){
        this.ika = ika;
        this.leposyke = leposyke;
    }
    private double maksimisyke(){
        return(206.3-(0.711*this.ika));
    }
    public double tavoitesyke(double prosenttiMaksimista){
        return((this.maksimisyke() - leposyke) * (prosenttiMaksimista) + leposyke);
    }
}
