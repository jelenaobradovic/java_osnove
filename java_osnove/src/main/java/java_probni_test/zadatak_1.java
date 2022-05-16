package java_probni_test;

import java.util.Scanner;

public class zadatak_1 {
    public static void main(String[] args) {

        //1. Napisati program koji za unetu visinu i težinu osobe
        // računa indeks telesne
        //mase (BMI) i na osnovu tog rezultata osobu
        // raspoređuje u jednu od četiri kategorije.
        //BMI se računa po formuli
        //𝐵𝑀𝐼 = 𝑡𝑒𝑧𝑖𝑛𝑎 𝑢 𝑘𝑔
        //(𝑣𝑖𝑠𝑖𝑛𝑎 𝑢 𝑚)2
        //dok se kategorija određuje prema tabeli 1.1.
        //Tabela 1.1 Određivanje kategorije na osnovu indeksa telesne mase
        //Primer izvrsenja: Unesite tezinu osobe (kg): 110
        //Unesite visinu osobe (m): 1.9
        //Kategorija je Gojaznost

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite visinu u m (primer 1.83m): ");
        double visina = s.nextDouble();
        System.out.println("Unesite tezinu u kg: ");
        double tezina = s.nextDouble();
        double bmi = 1.0*tezina/ (visina*visina);
        if (bmi<18.5){
            System.out.println("Kategorija je: neuhranjenost.");
        }
        else if (18.5<=bmi && bmi<25){
            System.out.println("Kategorija je: normalna tezina.");
        }
        else if(25<=bmi && bmi<30) {
            System.out.println("Kategorija je : prekomerna tezina.");
        }
        else if(bmi >30){
            System.out.println("Kategorija je: gojaznost");
        }

    }
}