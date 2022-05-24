package c24_05_22_klaseIObjekti;

public class Ugovor {
    //Kreirati klasu Ugovor koja ima:
    //godinu, dan i mesec sklapanja ugovora
    //osobu koja prodaje nekretninu (fizicko lice)
    //osobu koja kupuje nekretninu (fizicko lice)
    //cenu za koju se prodaje nekretnina
    //adresu nekretnine (ulica br., grad)


    private String datumUgovora;
    private int cena;
    private String adresa;
    private FizickoLice kupac;
    private FizickoLice prodavac;

    public Ugovor(String datumUgovora, int cena, String adresa, FizickoLice kupac, FizickoLice prodavac) {
        this.datumUgovora = datumUgovora;
        this.cena = cena;
        this.adresa = adresa;
        this.kupac = kupac;
        this.prodavac = prodavac;
    }

    public Ugovor() {
    }

    public String getDatumUgovora() {
        return datumUgovora;
    }

    public void setDatumUgovora(String datumUgovora) {
        this.datumUgovora = datumUgovora;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public FizickoLice getKupac() {
        return kupac;
    }

    public void setKupac(FizickoLice kupac) {
        this.kupac = kupac;
    }

    public FizickoLice getProdavac() {
        return prodavac;
    }

    public void setProdavac(FizickoLice prodavac) {
        this.prodavac = prodavac;
    }

    ////metodu koja vraca procenat zarade
    //    //za osobu koja je vec kupovale nekretninu preko agencije je
    //    // 0.02 dok je za one koji nisu 0.03
    //    //metodu koja racuna zaradu agencije pri prodaji nekretninte
    //    // koja ukljucujei poreze,
    //    // takse i usluge agencije, prema formuli:
    //    //1000 + cena za koju se prodaje * procenat zarade


    public double procenatZarade() {
        if (getKupac().isStariKupac() == true) {
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double zaradaAgencije() {
        double zarada = 1000 + cena * procenatZarade();
        return zarada;
    }

    //    //metodu koja stampa ugovor u formatu:
    //    //Dana (dan.mesec.godina.)god sklopljen je ugovor izmedju
    //    // (print prodavca) i (print kupca) o kupovini nekretnine
    //    // (adresa) po ceni od (cena nekretnin) pri cemu je kupac
    //    // u obavezi da agenciji isplati novcanu vrednost u iznosu
    //    // od (zarada agencije)

    public void stampa() {
        System.out.println(
                "Dana" + this.datumUgovora + "god sklopljen je ugovor izmedju" + this.kupac.getImeIPrezime() + "i" + this.prodavac.getImeIPrezime());
    }


}


