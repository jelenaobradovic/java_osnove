package Cas_03_06_Ice_Point;

public class Dodatak {

    //Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
    // naziv dodatka
    // cenu dodatka

    private String dodatak;
    private double cena;

    // konstruktore, gettere i settere koji su vam potrebni

    public Dodatak(String dodatak, double cena) {
        this.dodatak = dodatak;
        this.cena = cena;
    }

    public String getDodatak() {
        return dodatak;
    }

    public void setDodatak(String dodatak) {
        this.dodatak = dodatak;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    // metodu stampaj koja stampa u formatu:
    //(dodatak)  (cena)

    public void stampaj ()
    {
        System.out.println( this.dodatak + " " + this.cena);
    }

}
