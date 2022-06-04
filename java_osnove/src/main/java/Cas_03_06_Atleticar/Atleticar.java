package Cas_03_06_Atleticar;

public abstract class Atleticar {

//    Zadatak 3. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//    ime i prezime privatni
//    i rezultat ostvaren na takmičenju koji je zasticen

    private String imeIPrezime;
    protected double rezultat;

    public Atleticar() {
    }

    public Atleticar(String imeIPrezime, double rezultat) {
        this.imeIPrezime = imeIPrezime;
        this.rezultat = rezultat;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

//    Javne metode klase su:
//    apstratktna metoda koja ispituje da li je rezultat atletičara
//    bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)

    public abstract boolean daLiJeRezultatBolji (Atleticar a);


//    metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

    public void stampaj ()
    {
        System.out.println(this.imeIPrezime + " - "+ this.rezultat);
    }

}
