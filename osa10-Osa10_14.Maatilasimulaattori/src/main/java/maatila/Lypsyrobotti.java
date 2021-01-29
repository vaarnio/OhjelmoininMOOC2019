package maatila;

public class Lypsyrobotti {
    private Maitosailio maitosailio;

    public Lypsyrobotti(){

    }

    public Maitosailio getMaitosailio(){
        return this.maitosailio;
    }

    public void setMaitosailio(Maitosailio maitosailio){
        this.maitosailio = maitosailio;
    }

    public void lypsa(Lypsava lypsava){
        if(this.getMaitosailio() == null){
            System.out.println("Maidot menevät hukkaan!");
            return;
        }
        this.maitosailio.lisaaSailioon(lypsava.lypsa());
    }
}
