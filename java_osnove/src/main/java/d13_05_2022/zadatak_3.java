package d13_05_2022;


import java.util.ArrayList;
import java.util.Scanner;

public class zadatak_3 {
    public static void main(String[] args) {

        //Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti
        // (ne u nosi ih korisnik) a zatim se od korisnika ucitava pozicija elementa
        // koji zeli da izbaci iz niza. Pre i nakon izbacivanja ispisati niz na ekranu.
        // Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
        //Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022
        // Zadatak 3 brisanje iz niza“
        //Primer izvrsenja 1:
        //Niz je: 1,3,5,6,7,1,3,4,2,9
        //Unesite poziciju za izbacivanje: 5
        //Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
        //
        //Primer izvrsenja 2:
        //Niz je: 1,3,5,6,7,1,3,4,2,9
        //Unesite poziciju za izbacivanje: 11
        //Uneli ste nevalidnu poziciju!
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        brojevi.add(6);
        brojevi.add(122);
        brojevi.add(1);
        brojevi.add(0);
        brojevi.add(23);
        brojevi.add(6);
        brojevi.add(0);
        brojevi.add(2);
        brojevi.add(0);
        brojevi.add(3);
        brojevi.add(16);

        Scanner s = new Scanner(System.in);
        System.out.println("Originalni niz:");
        for (int i = 0; i < brojevi.size() ; i++) {
            System.out.println(brojevi.get(i));

        }

        System.out.println("Unesite poziciju za izbacivanje:");
        int pozicija = s.nextInt();

        if (0<=pozicija && pozicija< brojevi.size()) {
            brojevi.remove(pozicija);
            System.out.println("Novi niz:");
            for (int i = 0; i < brojevi.size(); i++) {
                System.out.println(brojevi.get(i));

            }}
            else {
                System.out.println("Uneli ste nevalidan broj");
            }
        }
    }