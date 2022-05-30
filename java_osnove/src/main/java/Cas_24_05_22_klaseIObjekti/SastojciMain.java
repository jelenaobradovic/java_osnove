package Cas_4_05_22_klaseIObjekti;

import java.util.ArrayList;
import java.util.Scanner;

public class SastojciMain {
    public static void main(String[] args) {

//        --U glavnom programu kreirati 3 sastojka.
//        U glavnom programu kreirati niz sastojaka ucitavajuci
//        ih od korisnika.Ucitavaju se N sastojaka i na kraju odstampati niz.Koristeci ArrayList -e

        Scanner s = new Scanner(System.in);
        ArrayList<Sastojci> nizSastojaka = new ArrayList<>();

        System.out.println("Unesite broj sastojaka");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Unesite sastojak i cenu");
            String sastojak1 = s.next();
            int cena1 = s.nextInt();
            nizSastojaka.add(new Sastojci(sastojak1, cena1));


        }
        for (int i = 0; i < n; i++) {
            System.out.println(nizSastojaka.get(i).getCena() + ", " + nizSastojaka.get(i).getNaziv());

        }


    }
}
