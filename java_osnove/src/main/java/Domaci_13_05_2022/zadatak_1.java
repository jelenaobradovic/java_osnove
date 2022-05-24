package Domaci_13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak_1 {
    public static void main(String[] args) {
//Napisati program koji ima niz brojeva od 25 elemenata,
// koji izgleda kao tabela 5x5.
// Niz je fiksnih vrednosti (ne unosi ih korisnik)
// zatim korisnik unosi poziciju za koju se racuna suma.
//Suma za poziciju se racuna tako sto se na vrednost tog polja
// dodaju vrednosti elemenata iznad, ispod, sleve i sdesne strane tog elementa
// (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//Za racunanje sume, nije potrebna petlja!

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(6);
        brojevi.add(1);
        brojevi.add(1);
        brojevi.add(0);
        brojevi.add(3);
        brojevi.add(6);
        brojevi.add(0);
        brojevi.add(2);
        brojevi.add(0);
        brojevi.add(3);
        brojevi.add(6);
        brojevi.add(0);
        brojevi.add(2);
        brojevi.add(0);
        brojevi.add(3);
        brojevi.add(6);
        brojevi.add(0);
        brojevi.add(2);
        brojevi.add(0);
        brojevi.add(3);
        brojevi.add(6);
        brojevi.add(0);
        brojevi.add(2);
        brojevi.add(0);
        brojevi.add(3);

        for (int i = 0; i < 25; i++) {
            if (i % 5 != 4) {
                System.out.print(brojevi.get(i));
            } else {
                System.out.println(brojevi.get(i));
            }

        }
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki broj (0-24)");
        int pozicija = s.nextInt();
        int suma = 0;
        int pozicijaIznad = 0;
        int pozicijaIspod = 0;
        int pozicijaLevo = 0;
        int pozicijaDesno = 0;

        if (pozicija == 0) {
            pozicijaIspod = pozicija + 5;
            pozicijaDesno = pozicija + 1;
            suma = brojevi.get(pozicijaDesno) + brojevi.get(pozicijaIspod);

        } else if (pozicija == 4) {

            pozicijaIspod = pozicija + 5;
            pozicijaLevo = pozicija - 1;

            suma = brojevi.get(pozicijaIspod) + brojevi.get(pozicijaLevo);
        } else if (pozicija == 20) {
            pozicijaIznad = pozicija - 5;
            pozicijaDesno = pozicija + 1;
            suma = brojevi.get(pozicijaDesno) + brojevi.get(pozicijaIznad);
        } else if (pozicija == 24) {
            pozicijaIznad = pozicija - 5;
            pozicijaLevo = pozicija - 1;
            suma = brojevi.get(pozicijaIznad) + brojevi.get(pozicijaLevo);
        } else if (pozicija%5==1) {
            pozicijaIznad = pozicija - 5;
            pozicijaIspod = pozicija + 5;
            pozicijaDesno = pozicija + 1;
            suma = brojevi.get(pozicijaIspod) + brojevi.get(pozicijaDesno) + brojevi.get(pozicijaIznad);
        } else if (pozicija%5 == 4) {
            pozicijaIznad = pozicija - 5;
            pozicijaIspod = pozicija + 5;
            pozicijaLevo = pozicija - 1;
            suma = brojevi.get(pozicijaIspod) + brojevi.get(pozicijaIznad) + brojevi.get(pozicijaLevo);

        } else if (pozicija == 1 || pozicija == 2 || pozicija == 3) {
            pozicijaIspod = pozicija + 5;
            pozicijaLevo = pozicija - 1;
            pozicijaDesno = pozicija + 1;
            suma = brojevi.get(pozicijaIspod) + brojevi.get(pozicijaDesno) + brojevi.get(pozicijaLevo);
        } else {
            pozicijaIznad = pozicija - 5;
            pozicijaLevo = pozicija - 1;
            pozicijaDesno = pozicija + 1;
            suma = brojevi.get(pozicijaIznad) + brojevi.get(pozicijaDesno) + brojevi.get(pozicijaLevo);
        }
        System.out.println("Suma iznosi " + suma);
    }
}