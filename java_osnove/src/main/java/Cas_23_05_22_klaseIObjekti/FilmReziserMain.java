package Cas_23_05_22_klaseIObjekti;

public class FilmReziserMain {
    public static void main(String[] args) {

        //U main metodi, kreirati jedan film i
        // jednog rezisera i pozvati svaku od metoda

//        Film titanik = new Film();
//        titanik.setGodina(1997);
//        titanik.setNaziv("Titanik"); dodela vrednosti preko settera

        // dodela vrednosti preko konstruktora koji smo napravili, ne defoultnog:

        Film titanik = new Film("Titanik", 1999);

        titanik.stampa();

        //ako pozovemo .stampa pre dodele vrednosti stampace se null i 0

        Reziser dzejmsKameron = new Reziser();
        dzejmsKameron.setStarost(70);
        dzejmsKameron.setImeIPrezime("Dzejms Kameron");

        dzejmsKameron.stampa();






    }
}
