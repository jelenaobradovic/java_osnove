package Cas_03_06_LokalZgradaKuca;

public class Zgrada extends Objekti{
    //	Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
    //broj stanova
    //konstuktore, gettere i setter

    private int brojStanova;

    public Zgrada(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }


    //porez racuna po formuli koeficijent * povrsina * broj stanova
    //prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu



    @Override
    public double izracunajPorez() {
        return this.koeficijentYone()*this.povrsinaObjekta*this.brojStanova;
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa: "+ this.adresa + ", Povrsina:"+ this.povrsinaObjekta+ ", Zona: "+
                this.zona + ", Broj stanova:" + this.brojStanova);

    }

    }






