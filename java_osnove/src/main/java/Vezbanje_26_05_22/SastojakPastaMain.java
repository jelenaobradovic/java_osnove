package Vezbanje_26_05_22;

import java.util.ArrayList;

public class SastojakPastaMain {
    public static void main(String[] args) {


        Sastojak spagete = new Sastojak("spagete", 100.2);
        Sastojak paradajz = new Sastojak("paradajz", 30);
        Sastojak pavlaka = new Sastojak("pavlaka", 50.2);
        Sastojak piletina = new Sastojak("piletina", 72.3);
        Sastojak beliLuk = new Sastojak("beli luk", 20);
        Sastojak zacini = new Sastojak("zacini", 15.5);
        Sastojak pecurke = new Sastojak("pecurke", 17.0);




        spagete.stampa();

        Pasta funghi = new Pasta();

        funghi.dodavanjeSastojaka(spagete);
        funghi.dodavanjeSastojaka(pavlaka);
        funghi.dodavanjeSastojaka(pecurke);
        funghi.dodavanjeSastojaka(zacini);

        funghi.stampa();

        System.out.println();

        funghi.brisanjeSastojaka(pecurke);

        funghi.stampa();




    }
}
