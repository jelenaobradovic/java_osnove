package Cas_02_06_Kartica;

public class Visa_Kartica extends Kartica{
    //  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
    // ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje

    private String ovlascenoLice;

    // da podize novac u ekspozituri.
    //getter i setter za ovlasceno lice

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }


    //konstruktor sa parametrima

    public Visa_Kartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja, String ovlascenoLice) {
        super(suma, brojKartice, godinaVazenja, mesecVazenja);
        this.ovlascenoLice = ovlascenoLice;
    }


    //  implementira metodu izvrsiTransakciju,  tako da na prosledjenu
    //  sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.



    //  implementira metodu koja stampa podatke o kartici u formatu:
    //	  Visa Card: 4012-1239-1221-3381, 11/2019, $212
    @Override

    public void izvrsiTransakciju(int transakcija) {
        if (transakcija + 1.8 / 100 * this.suma <= this.suma ) {
            if (1.8/100*this.suma<4)
            {this.suma = this.suma - transakcija - 1.8 / 100 * this.suma;}
            else {this.suma=this.suma - transakcija- 4;}
        }
    }


    @Override
    public void stampaj() {

        System.out.println(this.brojKartice + " - "+ this.godinaVazenja + "/"
                + this.mesecVazenja + " - $"+ this.suma);
    }



}
