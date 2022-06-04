package Cas_03_06_Atleticar;

public class Trkac extends Atleticar {

    public Trkac() {
    }

    public Trkac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean daLiJeRezultatBolji(Atleticar a) {
        if (this.rezultat<a.rezultat)
        {return true;}
        else{ return false; }
    }
    // Kreirati i klase Trkac i Skakac izvedene iz klase
    // Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
}
