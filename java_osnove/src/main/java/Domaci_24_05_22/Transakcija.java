package Domaci_24_05_22;

public class Transakcija {
//
//    Kreirati klasu Transakcija koja ima:
//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere
//            konstruktore


    private String idTransakcije;
    private Racun racunPosaljilac;
    private Racun racunPrimalac;

    public Transakcija() {
    }

    public Transakcija(String idTransakcije, Racun racunPosaljilac, Racun racunPrimalac) {
        this.idTransakcije = idTransakcije;
        this.racunPosaljilac = racunPosaljilac;
        this.racunPrimalac = racunPrimalac;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getRacunPosaljilac() {
        return racunPosaljilac;
    }

    public void setRacunPosaljilac(Racun racunPosaljilac) {
        this.racunPosaljilac = racunPosaljilac;
    }

    public Racun getRacunPrimalac() {
        return racunPrimalac;
    }

    public void setRacunPrimalac(Racun racunPrimalac) {
        this.racunPrimalac = racunPrimalac;
    }

    //privatnu metodu koja racuna i vraca proviziju za izvrsenje
//    transakcije koja se racuna:
//    ako je prenos sredstava manji od 4500, provizija je fiksna 45
//    ako je prenos sredstava veci od 4500, provizija je 1%
//    S obzirom da se provizija racuna na osnovu visine transakcije,
//    znaci da metoda prima parametar koji predstavlja visinu transakcije
//    Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju
//    racunajte fiksnu proviziju u vrednosti od 45.


    private double provizija(double iznosTransakcije) {
        if (iznosTransakcije < 4500.0) {
            return 45;
        } else {
            return iznosTransakcije / 100;
        }
    }


    //    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//    Kao parametar funkcije se unosi vrednost koja se prebacuje.
//    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//    a na drugi racun dodaje samo (trazena suma).
//    (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//



    public void izvrsiTransakciju(double iznosTransakcije) {
        if (iznosTransakcije + provizija(iznosTransakcije) < this.racunPosaljilac.getTrenutnoStanje()) {
            double x = iznosTransakcije + provizija(iznosTransakcije);
            this.racunPosaljilac.promenaStanja(x);
            this.racunPrimalac.promenaStanja(-1 * iznosTransakcije);
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu");
            System.out.println();
        }
    }

    //    metodu koja stampa podatke o transakciji u formatu:
//    id transkacije
//    Racun sa: Ime i prezime  -  broj racuna
//    Racun na: Ime i prezime  -  broj racuna

    public void stampaTransakcije (Transakcija transakcija)

    {
        System.out.println("Id transakcije: "+ this.idTransakcije);
        System.out.println("Racun sa: " + this.racunPosaljilac.getImeIPrezime() +
                " - " + this.racunPosaljilac.getBrojRacuna());
        System.out.println("Racun na: "+ this.racunPrimalac.getImeIPrezime() + " - "+
                this.racunPrimalac.getBrojRacuna());
        System.out.println();
    }
}
