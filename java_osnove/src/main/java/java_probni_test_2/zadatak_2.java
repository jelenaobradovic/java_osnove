package java_probni_test_2;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak_2 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<>();
        // Napisati program koji učitava brojeve od korisnika dok ne unese dve nule
        //zaredom.Na kraju programa ispisati sumu unetih brojeva.
        //Primer izvršenja 1:
        //Unesite broj: 1
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 5
        //Unesite broj: 9
        //Unesite broj: 0
        //Unesite broj: 0

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        Integer broj = s.nextInt();
        niz.add(broj);
        int suma = 0;
        boolean index = true;
        int i=0;
        while (index == true) {
            System.out.println("Unesite neki broj: ");
            broj = s.nextInt();
            niz.add(broj);
            i++;
            suma = suma + broj;
            if (niz.get(i) == 0 && niz.get(i - 1) == 0) {
                index = false;
            }


        }
        System.out.println("Suma unetih brojeva je: " + suma);
    }
}
