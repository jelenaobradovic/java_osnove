package Cas_23_05_22_klaseIObjekti;

public class Kupac {

    ///Kreirati klasu Kupac koja ima:
    ////ime i prezime
    ////clansku kartu
    ////gettere i settere, clanska karta ne moze da se menja
    ////konstruktore
    ////metodu stampaj koja stampa u formatu
    ////ime i prezime - broj kartice

    private String imeIPrezime;

    private Kartica kartica;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Kartica getKartica() {
        return kartica;
    }

    public Kupac(Kartica kartica1) {
    }

    public Kupac(String imeIPrezime, Kartica kartica) {
        this.imeIPrezime = imeIPrezime;
        this.kartica = kartica;
    }
}
