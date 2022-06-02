package Cas_02_06_Kartica;

public abstract class Kartica {
    //2. .Zadatak
    //  Napraviti klasu apstraktnu PlatnaKartica koja ima
    //  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
    //  atribut broj kartice  primer: 4012-1239-1221-3381
    //  atribut godina - godina do kada vazi kartica
    //  atribut mesec-  mesec do kada vazi kartica
    //  konstruktor sa parametrima
    //  gettere za sve atribute, bez settera
    //

    protected double suma;
    protected String  brojKartice;
    protected int godinaVazenja;
    protected int mesecVazenja;

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
    //metodu dodajSredstva koja povecava sumu za unetu vrednost
    //  apstraktnu metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
    //  apstraktnu metodu koja stampa podatke o kartici.


    public void dodajsredstva (int uplata)
    {this.suma=this.suma+uplata;}

    public abstract void izvrsiTransakciju (int transakcija);

    public abstract void stampaj ();

}
