package Cas_23_05_22_klaseIObjekti;

public class KPKMain {
    public static void main(String[] args) {

        Kartica kartica1 = new Kartica();
        kartica1.setBrojKartice("123456");
        kartica1.setPopust(20);

        Kupac korisnik1 = new Kupac(kartica1);
        korisnik1.setImeIPrezime("Ana Petrovic");

        Proizvod proizvod1 = new Proizvod();
        proizvod1.setNaziv("Sat");
        proizvod1.setCenaIzrade(200);

        proizvod1.stampa();


    }
}
