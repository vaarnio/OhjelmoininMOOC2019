import java.util.ArrayList;
import java.util.List;

public class Hajautustaulu<K, V> {
    private List<Pari<K, V>>[] arvot;
    private int arvoja;

    public Hajautustaulu() {
        this.arvot = new ArrayList[32];
        this.arvoja = 0;
    }

    public V hae(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.length);
        if (this.arvot[hajautusArvo] == null) {
            return null;
        }

        List<Pari<K, V>> arvotIndeksissa = arvot[hajautusArvo];

        for (int i = 0; i < arvotIndeksissa.size(); i++) {
            if (arvotIndeksissa.get(i).getAvain().equals(avain)) {
                return arvotIndeksissa.get(i).getArvo();
            }
        }

        return null;
    }

    public void lisaa(K avain, V arvo) {
        List<Pari<K, V>> arvotIndeksissa = haeAvaimeenLittyvaLista(avain);
        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);

        if (indeksi < 0) {
            arvotIndeksissa.add(new Pari<>(avain, arvo));
            this.arvoja++;
        } else {
            arvotIndeksissa.get(indeksi).setArvo(arvo);
        }

        if (1.0 * this.arvoja / this.arvot.length > 0.75) {
            kasvata();
        }
    }

    public V poista(K avain) {
        List<Pari<K, V>> arvotIndeksissa = haeAvaimeenLittyvaLista(avain);
        if (arvotIndeksissa.size() == 0) {
            return null;
        }

        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);
        if (indeksi < 0) {
            return null;
        }

        Pari<K, V> pari = arvotIndeksissa.get(indeksi);
        arvotIndeksissa.remove(pari);
        return pari.getArvo();
    }

    private void kasvata() {
        // luodaan uusi taulukko
        List<Pari<K, V>>[] uusi = new ArrayList[this.arvot.length * 2];

        for (int i = 0; i < this.arvot.length; i++) {
            // kopioidaan vanhan taulukon arvot uuteen
            kopioi(uusi, i);
        }

        // korvataan vanha taulukko uudella
        this.arvot = uusi;
    }

    private void kopioi(List<Pari<K, V>>[] uusi, int indeksista) {
        for (int i = 0; i < this.arvot[indeksista].size(); i++) {
            Pari<K, V> arvo = this.arvot[indeksista].get(i);

            int hajautusarvo = Math.abs(arvo.getAvain().hashCode() % uusi.length);
            if(uusi[hajautusarvo] == null) {
                uusi[hajautusarvo] = new ArrayList<>();
            }

            uusi[hajautusarvo].add(arvo);
        }
    }

    private List<Pari<K, V>> haeAvaimeenLittyvaLista(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % arvot.length);
        if (arvot[hajautusArvo] == null) {
            arvot[hajautusArvo] = new ArrayList<>();
        }

        return arvot[hajautusArvo];
    }

    private int haeAvaimenIndeksi(List<Pari<K, V>> lista, K avain) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAvain().equals(avain)) {
                return i;
            }
        }

        return -1;
    }
}
