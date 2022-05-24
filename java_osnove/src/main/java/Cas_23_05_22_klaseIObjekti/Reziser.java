package Cas_23_05_22_klaseIObjekti;

public class Reziser {
    //Kreirati klasu Reziser koja ima:
    //ime i prezime rezisera
    //starost
    //konstruktore, gettere i settere koji su potrebni
    //metodu print koja stampa podatke u formatu
    //ime prezime, starost.god

    private String imeIPrezime;
    private int starost;

    public Reziser() {

    }

    public Reziser(String imeIPrezime, int starost) {
        this.imeIPrezime = imeIPrezime;
        this.starost = starost;
    }

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }

    public int getStarost() {
        return starost;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void stampa() {
        System.out.println(this.imeIPrezime + ", " + this.starost);
    }
}
