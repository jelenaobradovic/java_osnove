package Cas_23_05_22_klaseIObjekti;

public class Film {
    //.Zadatak
    //Kreirati klasu Film koja ima:
    //naziv filma
    //iz koje godine je film
    //konstruktore, gettere i settere koji su potrebni
    //metodu print koja stampa podatke u formatu
    //naziv filma, godina

    private String naziv ;
    private int godina;

    public Film ()
    {

    }

    public Film (String naziv, int godina)
    {this.godina=godina; this.naziv=naziv;}

    public String getNaziv()
    {return this.naziv;}

    public int getGodina ()
    {return  this.godina;}

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void stampa () {
        System.out.println(this.naziv + ", " + this.godina);
    }
}
