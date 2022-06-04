package Cas_03_06_LokalZgradaKuca;

public class Lokal extends Objekti{

    //	Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
    //konstuktore

    public Lokal() {
    }

    public Lokal(String adresa, double povrsinaObjekta, int zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    //porez racuna po formuli koeficijent * povrsina * 1.3
    //prepisati metodu stampaj tako da stampa sve podatke vezane za lo

    @Override
    public double izracunajPorez() {
        return this.koeficijentYone()*this.povrsinaObjekta*1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: "+ this.adresa + ", Povrsina:"+ this.povrsinaObjekta+ ", Zona: "+
                this.zona );

    }

    }




