package sanakirja;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class MuistavaSanakirja {
    private Map<String, String> suomi;
    private Map<String, String> kaannos;
    private String tiedosto;

    public MuistavaSanakirja(){
        this.suomi = new HashMap<>();
        this.kaannos = new HashMap<>();
    }

    public MuistavaSanakirja(String tiedosto){
        this.suomi = new HashMap<>();
        this.kaannos = new HashMap<>();
        this.tiedosto = tiedosto;
    }

    public void lisaa(String sana, String kaannos){
        this.suomi.putIfAbsent(sana, kaannos);
        this.kaannos.putIfAbsent(kaannos, sana);
    }

    public String kaanna(String sana){
        if(this.suomi.containsKey(sana)){
            return this.suomi.get(sana);
        } else if(this.kaannos.containsKey(sana)){
            return this.kaannos.get(sana);
        }
        return null;
    }

    public void poista(String sana){
        if(this.suomi.containsKey(sana)) {
            this.kaannos.remove(suomi.get(sana));
            this.suomi.remove(sana);
        }
        if(this.kaannos.containsKey(sana)){
            this.suomi.remove(kaannos.get(sana));
            this.kaannos.remove(sana);
        }
    }

    public boolean lataa(){
        try (Scanner tiedostonLukija = new Scanner(new File(this.tiedosto))){
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");   // pilkotaan rivi :-merkkien kohdalta

                this.suomi.put(osat[0], osat[1]);
                this.kaannos.put(osat[1], osat[0]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean tallenna(){
        try(PrintWriter kirjoittaja = new PrintWriter(this.tiedosto)){
            for(String sana : this.suomi.keySet()){
                kirjoittaja.println(sana + ":" + this.suomi.get(sana));
            }
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
