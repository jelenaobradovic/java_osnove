package Cas_31_05_Kartica_master_visa;

public class Kartica {
//    Napraviti klasu PlatnaKartica koja ima
//    atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//    atribut broj kartice  primer: 4012-1239-1221-3381
//    atribut godina - godina do kada vazi kartica
//    atribut mesec-  mesec do kada vazi kartica
//    konstruktor sa parametrima
//    gettere za sve atribute, bez settera
//    metodu dodajSredstva koja povecava sumu za unetu vrednost
//    metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//    metodu koja stampa podatke o kartici u formatu:
//            4012-1239-1221-3381, 11/2019, $212

    protected double suma;
    protected String  brojKartice;
    protected int godinaVazenja;
    protected int mesecVazenja;

    public Kartica() {
    }

    public Kartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaVazenja = godinaVazenja;
        this.mesecVazenja = mesecVazenja;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaVazenja() {
        return godinaVazenja;
    }

    public int getMesecVazenja() {
        return mesecVazenja;
    }

    public void dodajsredstva (int uplata)
    {this.suma=this.suma + uplata;}


    public void izvrsiTransakciju(int transakcija)
    {if (transakcija<=this.suma)
    { this.suma= this.suma - transakcija; }}


    public void stampaj ()
    {
        System.out.println(this.brojKartice + " - "+ this.godinaVazenja + "/"
                + this.mesecVazenja + " - $"+ this.suma);
    }
}
