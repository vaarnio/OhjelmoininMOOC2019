package maatila;

import static java.lang.Math.ceil;


public class Maitosailio {
    private double tilavuus;
    private double saldo;

    public Maitosailio(){
        this.tilavuus = 2000;
        this.saldo = 0;
    }
    public Maitosailio(double tilavuus){
        this.tilavuus = tilavuus;
        this.saldo = 0;
    }

    public double getTilavuus() {
        return tilavuus;
    }

    public double getSaldo() {
        return saldo;
    }

    public double paljonkoTilaaJaljella(){
        return this.tilavuus - this.saldo;
    }

    public void lisaaSailioon(double maara){
        if(this.saldo+maara <= tilavuus){
            this.saldo = this.saldo+maara;
        } else {
            this.saldo = this.tilavuus;
        }
    }

    public double otaSailiosta(double maara){
        if(this.saldo >= maara){
            this.saldo = this.saldo - maara;
            return maara;
        } else {
            double otettavaMaara = this.saldo;
            this.saldo = 0;
            return otettavaMaara;
        }
    }

    public String toString(){
        return ceil(this.saldo) + "/" + ceil(this.tilavuus);
    }
}