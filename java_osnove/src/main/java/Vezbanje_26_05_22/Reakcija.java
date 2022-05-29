package Vezbanje_26_05_22;

public class Reakcija {
//    //
//    Zadatak(Za vezbanje)
//    Kreirati klasu Reakcija koja ima
//    tip reakcije (smajli, like, srce)
//    ime i prezime korisnika koji je reagovao
//    gettere, settere i konstruktore

    private String tipReakcije;
    private String korisnikReakcija;

    public Reakcija() {
    }

    public Reakcija(String tipReakcije, String korisnikReakcija) {
        this.tipReakcije = tipReakcije;
        this.korisnikReakcija = korisnikReakcija;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public String getKorisnikReakcija() {
        return korisnikReakcija;
    }

    public void setKorisnikReakcija(String korisnikReakcija) {
        this.korisnikReakcija = korisnikReakcija;
    }
}
