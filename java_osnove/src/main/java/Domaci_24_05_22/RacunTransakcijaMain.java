package Domaci_24_05_22;

public class RacunTransakcijaMain {
    public static void main(String[] args) {

        Racun racun1 = new Racun("222-123456-258",
                "Jovan Jovanovic",10000.0);

        Racun racun2 = new Racun("123-333-888","Petar Petrovic",0);

        Racun racun3 = new Racun("333-555-999", "Ana Petrovic",55000.0);


        Transakcija transakcija1 = new Transakcija("888999", racun1, racun2);

        Transakcija transakcija2 = new Transakcija("546987", racun2, racun3);

        Transakcija transakcija3 = new Transakcija("44444", racun3, racun2);

        double iznosTransakcije1=2000;
        double iznosTransakcije2=3000;
        double iznosTransakcije3=60000;

        racun1.stampa();
        racun2.stampa();
        racun3.stampa();


        transakcija1.izvrsiTransakciju(iznosTransakcije1);

        transakcija1.stampaTransakcije(transakcija1);

        racun1.stampa();
        racun2.stampa();

        transakcija2.izvrsiTransakciju(iznosTransakcije2);

        transakcija2.stampaTransakcije(transakcija2);

        racun2.stampa();
        racun3.stampa();
    }
}
