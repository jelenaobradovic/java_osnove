package Cas_18_05_22_klaseIObjekti;

import java.util.Scanner;

public class MainRacun {
    public static void main(String[] args) {
        //1.Zad
        ////		Kreirati klasu Racun koja ima
        ////		broj racuna (npr: 840-23932-323)
        ////		ime i prezime vlasnika
        ////		stanje na racunu
        ////		U mainu kreirati minimum dva racuna
        // sa pratecim podacima i ostampati podatke za
        // svaki objekat.

        Racun tekuci1 = new Racun();
        tekuci1.brojRacuna="123456789";
        tekuci1.imeIPrezime= "Jovana Jocic";
        tekuci1.stanjeNaRacunu=123.12;

//        System.out.println("broj racuna:"+ tekuci1.brojRacuna);
//        System.out.println("Ime i prezime:"+ tekuci1.imeIPrezime);
//        System.out.println("Stanje na racunu: "+ tekuci1.stanjeNaRacunu);

        Racun tekuci2 = new Racun();
        tekuci2.brojRacuna="222333222";
        tekuci2.imeIPrezime= "Jovan Jocic";
        tekuci2.stanjeNaRacunu=300.12;

//        System.out.println("broj racuna:"+ tekuci2.brojRacuna);
//        System.out.println("Ime i prezime:"+ tekuci2.imeIPrezime);
//        System.out.println("Stanje na racunu: "+ tekuci2.stanjeNaRacunu);

        //Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun.
        // Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
        //
        //Primer izvrsenja:
        //Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
        //Primalac: Marko Markovic, 840-23932-334, stanje: 200
        //Unesite sumu za transakciju: 500
        //Stanje nakon stransakcije
        //Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
        //Primalac: Marko Markovic, 840-23932-334, stanje: 700
        Scanner s = new Scanner(System.in);
        System.out.println("posaljilac : "+ tekuci1.imeIPrezime+ ", "+ tekuci1.brojRacuna + ", stanje "+ tekuci1.stanjeNaRacunu  );
        System.out.println("posaljilac : "+ tekuci2.imeIPrezime+ ", "+ tekuci2.brojRacuna + ", stanje "+ tekuci2.stanjeNaRacunu  );
        System.out.println("Unesite sumu za transakciju:");
        double suma = s.nextDouble();

        tekuci1.stanjeNaRacunu=tekuci1.stanjeNaRacunu - suma ;
        tekuci2.stanjeNaRacunu=tekuci2.stanjeNaRacunu + suma ;

        System.out.println("posaljilac : "+ tekuci1.imeIPrezime+ ", "+ tekuci1.brojRacuna + ", stanje "+ tekuci1.stanjeNaRacunu  );
        System.out.println("posaljilac : "+ tekuci2.imeIPrezime+ ", "+ tekuci2.brojRacuna + ", stanje "+ tekuci2.stanjeNaRacunu  );

    }
    }

