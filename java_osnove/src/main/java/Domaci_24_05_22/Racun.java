package Domaci_24_05_22;

public class Racun {


//    Kreirati klasu Racun koja ima:
//    broj racuna (npr: 170-289328923-23)
//    ime i prezime osobe
//    trenutno stanje na racunu (npr: 100, 1220)
//    gettere i setter za sve atribute, sem settera za stanje na racunu



private String brojRacuna;
private String imeIPrezime;
private double trenutnoStanje;

    public Racun() {
    }

    public Racun(String brojRacuna, String imeIPrezime, double trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    //    metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)

//    metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.

    public void promenaStanja (double iznosTransakcije)
    {if (iznosTransakcije<this.trenutnoStanje)
    {this.trenutnoStanje=this.trenutnoStanje-iznosTransakcije;
    }
        else {this.trenutnoStanje=this.trenutnoStanje-0;
    }
    }
    public void stampa ()
    {
        System.out.println(this.imeIPrezime + " - "+ this.brojRacuna);
        System.out.println("Stanje na racunu je : "+ this.trenutnoStanje + " rsd.");
        System.out.println();
    }

}
