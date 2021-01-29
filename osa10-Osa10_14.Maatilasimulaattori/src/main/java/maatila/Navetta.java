package maatila;

import java.util.List;

public class Navetta {
    private Lypsyrobotti lypsyrobotti;
    private Maitosailio maitosailio;

    public Navetta(Maitosailio maitosailio){
        this.maitosailio = maitosailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti){
        this.lypsyrobotti = lypsyrobotti;
        this.lypsyrobotti.setMaitosailio(this.maitosailio);
    }

    public void hoida(Lehma lehma){
        if(this.lypsyrobotti == null){
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu!");
        } else {
            lypsyrobotti.lypsa(lehma);
        }
    }

    public Maitosailio getMaitosailio(){
        return this.maitosailio;
    }

    public void hoida(List<Lehma> lehmat){
        if(this.lypsyrobotti == null){
            throw new IllegalStateException("Lypsyrobottia ei ole asennettu!");
        } else {
            for(Lehma lehma : lehmat){
                lypsyrobotti.lypsa(lehma);
            }
        }
    }
    public String toString(){
        return this.maitosailio.toString();
    }
}
