package Cas_4_05_22_klaseIObjekti;

public class Sastojci {

    //3.Zadatak
    //Kreirati klasu Sastojak koja ima:
    //naziv sastojka
    //cenu
    //gettere i settere
    //konstuktore
    //--U glavnom programu kreirati 3 sastojka.
    //	 U glavnom programu kreirati niz sastojaka
    //	 ucitavajuci ih od korisnika. Ucitavaju se N sastojaka
    //	 i na kraju odstampati niz. Koristeci ArrayList-e

    private String naziv;
    private int cena;

    public Sastojci(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public Sastojci() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
