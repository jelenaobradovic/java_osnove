package Cas_03_06_LokalZgradaKuca;

public class Kuca extends Objekti {
    //Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu,
    //konstuktore, gettere i setter

   private int brojaClanova;

    public Kuca(int brojaClanova) {
        this.brojaClanova = brojaClanova;
    }

    public Kuca(String adresa, double povrsinaObjekta, int zona, int brojaClanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojaClanova = brojaClanova;
    }

    public int getBrojaClanova() {
        return brojaClanova;
    }

    public void setBrojaClanova(int brojaClanova) {
        this.brojaClanova = brojaClanova;
    }

    //porez racuna po formuli: koeficijent * povrsina.
    //prepisati metodu stampaj tako da stampa sve podatke vezane za kucu

    @Override
    public double izracunajPorez() {
        return this.koeficijentYone()*this.povrsinaObjekta;
    }

    @Override
    public void stampaj() {

        System.out.println("Adresa: "+ this.adresa + ", Povrsina:"+ this.povrsinaObjekta+ ", Zona: "+
                this.zona + ", Broj clanova:" + this.brojaClanova);

    }



}
