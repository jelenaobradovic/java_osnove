package Cas_31_05_Kartica_master_visa;

public class Master_kartica extends Kartica {

    //Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
    //  konstruktor sa parametrima
    //  implementira metodu koja vrsi transakciju, tako da
    //  na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
    //  metoda naplatiOdrzavanje, koja sa racuna skida $2.


    public Master_kartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja) {
        super(suma, brojKartice, godinaVazenja, mesecVazenja);
    }

    @Override

    public void izvrsiTransakciju (int transakcija)

    {if (transakcija+ 1.5/100*this.suma<=this.suma)
    { this.suma= this.suma - transakcija-1.5/100*this.suma; }}


    public void naplatiOdrzavanje ()
    {this.suma=this.suma-2;}

    //  implementira metodu koja stampa podatke o kartici u formatu:
    //	  Master Card: 12/2019, 4012-1239-1221-3381, $232
    //	  u main funkciji, napraviti visa i master kartice i testirati funkcije

    @Override

    public void stampaj ()
    {
        System.out.println("Master: "+ this.brojKartice + " - "+ this.godinaVazenja + "/"
                + this.mesecVazenja + " - $"+ this.suma );
    }

}
