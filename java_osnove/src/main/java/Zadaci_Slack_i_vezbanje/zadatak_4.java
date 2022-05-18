package Zadaci_Slack_i_vezbanje;

import java.util.Scanner;

public class zadatak_4 {
    //bez nizova)
    //Napisati program koji simulira ponasanje igre Makao.
    //Korisnik na pocetku programa unosi koja je prva karta
    // na stolu. Svaka karta ima 2 informacije, ima broj i znak.
    //Karta moze da ima:
    //broj = 2,3,4,5,6,7,8,9,10,A,J,Q,K
    //znak = s (za srce), k (za kocku), l (za list), d (za detelinu)
    //Nakon toga korisnik unosi sledecu kartu koja se igra sve
    // dok se ne unese nevalidan potez. Igranje poteza se uvek
    // odnosi na poslednju odigranu kartu.
    //Potez je validan ukoliko se odigrana karta i karta koja
    // je na stolu poslednja, slazu po znaku ili po broju
    //Napomena: Smatrati da korisnik unosi broj i znak karte
    // u dozvoljenom opsegu
    //Unesite znak karte na stolu: s
    //Unesite broj karte na stolu: 5
    //Poslednja karta na stolu je sad: 5 s
    //Sledeci potez
    //Unesite znak:d
    //Unesite broj:5
    //Potez je validan
    //Poslednja karta na stolu je sad: 5 d
    //Sledeci potez
    //Unesite znak:d
    //Unesite broj:J
    //Potez je validan
    //Poslednja karta na stolu je sad: J d
    //Sledeci potez
    //Unesite znak:s
    //Unesite broj:3
    //Nevalidan potez. Kraj igre.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite kartu, znak i broj:");
        String znak = s.next();
        String broj =s.next();
        String poslednjaKarta = znak+" "+broj;
        System.out.println("Poslednja karta je "+poslednjaKarta);
        boolean play=true;
        while (play==true){
            System.out.println("Unesite znak i broj");
            znak=s.next();
            broj=s.next();
            if(poslednjaKarta.contains(znak) || poslednjaKarta.contains(broj)){
                {poslednjaKarta=znak+broj;
                    System.out.println("Poslednja karta je sada "+ poslednjaKarta);}
            }else{play=false;
                System.out.println("Kraj");}
        }

    }
}
