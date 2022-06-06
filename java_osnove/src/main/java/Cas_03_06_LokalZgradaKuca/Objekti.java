package Cas_03_06_LokalZgradaKuca;

public abstract class Objekti {
    //Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi:
    //adresa (ulica i broj)
    //povrsina objekta
    //zona (1, 2 ili 3)
    //konstuktore, gettere i settere

    protected String adresa;
    protected double povrsinaObjekta;
    protected int zona;

    public Objekti() {
    }

    public Objekti(String adresa, double povrsinaObjekta, int zona) {
        this.adresa = adresa;
        this.povrsinaObjekta = povrsinaObjekta;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getPovrsinaObjekta() {
        return povrsinaObjekta;
    }

    public void setPovrsinaObjekta(double povrsinaObjekta) {
        this.povrsinaObjekta = povrsinaObjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }


    //metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti
    // u kojoj zoni se nalazi objekat
    //zona 1, koeficijent je 1.4
    //zona 2, koeficijent je 1.1
    //zona 3, koeficijent je 1.05

    public double koeficijentYone ()
    {if (this.zona==1)
    {return 1.4;}
    else if (this.zona==2) {
        return 1.1;
    }
    else {return 1.05;}

    }

    //abstraktnu metodu koja racuna i vraca porez objekta

    public abstract double izracunajPorez();

    //abstraktnu metodu stampaj

    public abstract void stampaj();
}
