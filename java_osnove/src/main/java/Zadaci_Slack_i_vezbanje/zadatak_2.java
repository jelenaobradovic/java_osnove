package Zadaci_Slack_i_vezbanje;

import java.util.Scanner;

public class zadatak_2 {
    //Napisati program (petlju) koja iscrtava tablu dimenzije
    // 5x5 kao iz primera
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //II faza
    //Uvodimo coveculjka u igru C ,
    // pocetna pozicija coveculjka je na poziciji 1.
    // Pozicija covecuklja ce cuva u programu.
    // Na slici su prikazane pozicije na tabli.
    // Primer stampe
    // C |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //III faza
    //Uvodimo akcije za pomeranje coveculjka na tabli.
    //w - pomera coveculjka u red iznad (ukoliko je u prvom redu, coveculjak ostaje na istaom mestu)
    //npr: ukoliko se coveculjak nalazi na poziciji 4 i uneses se akcija w coveculjak ostaje na istoj poziciji
    //npr: ukoliko se coveculjak nalazi na poziciji 13 i uneses se akcija w coveculjak prelazi na pozicjiu 8
    //a - pomera coveculjka u polje sa leve strane
    //ukoliko se coveculjak nalazi na poziciji 6 i uneses se akcija a coveculjak ostaje na istoj poziciji
    //ukoliko se coveculjak nalazi na poziciji 8 i uneses se akcija a coveculjak prelazi na poziciju 7
    //s - pomera coveculjka u red ispod
    //ukoliko se coveculjak nalazi na poziciji 22 i uneses se akcija s coveculjak ostaje na istoj poziciji
    //ukoliko se coveculjak nalazi na poziciji 17 i uneses se akcija x coveculjak prelazi na poziciju 22
    //d - pomera coveculjka u polje sa desne strane
    //ukoliko se coveculjak nalazi na poziciji 10 i uneses se akcija d coveculjak ostaje na istoj poziciji
    //ukoliko se coveculjak nalazi na poziciji 9 i uneses se akcija d coveculjak prelazi na poziciju 10
    //Bitno je da prilikom izvrsenja ovih akcija coveculjak ne moze da izadje van table.
    //Korisnik unosi N akcija i nakon svake akcije se stampa stanje na tabeli
    //Primer izvrsenja:
    //Unesite N:5
    //Unesite akciju:d
    //   | C |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //Unesite akciju:d
    //   |   | C |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //Unesite akciju:s
    //   |   |   |   |   |
    //   |   | C |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //Unesite akciju:w
    //   |   | C |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //Unesite akciju:w
    //   |   | C |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |
    //   |   |   |   |   |

    //IV faza
    //Korisnik na pocetku programa bira dimanziju table.
    //Primer izvrsenja u threadu.

//    Unesite dimenziju table:8
//    Unesite broj akcija:10
//    Unesite akciju:d
//            | C |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:d
//            |   | C |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:s
//            |   |   |   |   |   |   |   |
//            |   | C |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:s
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   | C |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:a
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            | C |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:a
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//              C |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:a
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//          C |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:w
//            |   |   |   |   |   |   |   |
//          C |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:w
//          C |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//    Unesite akciju:w
//          C |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//            |   |   |   |   |   |   |   |
//
//    Process finished with exit code 0

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dimenzije table/ 5 za 5x5 itd:");
        int brojPoljaURedu = s.nextInt();
        int dimenzijaTable = brojPoljaURedu * brojPoljaURedu;
        int pozicija = 1;

        for (int i = 0; i < dimenzijaTable; i++) {
            if (i % brojPoljaURedu == (brojPoljaURedu - 1)) {
                System.out.println(" |");
            } else {
                System.out.print(" |");
            }


        }
        System.out.println();

        for (int j = 1; j <= dimenzijaTable; j++) {
            if (j == pozicija) {
                System.out.print("C|");
            } else if (j % brojPoljaURedu == 0)
            //posto smo u uslovu posli od j=1, jer je pocetna pozicija 1
            // a ne o, onda ovde nije % do brojpolja-1, nego 0
            {
                System.out.println(" |");
            } else {
                System.out.print(" |");
            }
        }
        System.out.println();


        System.out.println("Unesite broj akcija: ");
        int brojAkcija = s.nextInt();

        for (int i = 0; i < brojAkcija; i++) {
            System.out.println("Unesite akciju: w/a/s/d");
            String akcija = s.next();

            if (akcija.equals("w") && pozicija - brojPoljaURedu >= 0) {
                pozicija = pozicija - brojPoljaURedu;
            }
            if (akcija.equals("a") && pozicija % brojPoljaURedu != 0) {
                pozicija = pozicija - 1;
            }
            if (akcija.equals("s") && pozicija % brojPoljaURedu != 4) {
                pozicija = pozicija + 1;
            }
            if (akcija.equals("d") && pozicija + brojPoljaURedu <= dimenzijaTable) {
                pozicija = pozicija + brojPoljaURedu;
            } else {
                System.out.println("Pozicija je " + pozicija);

                for (int j = 0; j < dimenzijaTable; j++) {

                    if (j == pozicija) {
                        System.out.print("C|");
                    } else if (j % brojPoljaURedu == brojPoljaURedu - 1) {
                        System.out.println(" |");
                    } else {
                        System.out.print(" |");
                    }
                }
            }
        }

    }
}
