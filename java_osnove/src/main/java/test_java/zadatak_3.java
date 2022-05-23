package test_java;

import java.util.Scanner;

public class zadatak_3 {
    public static void main(String[] args) {
        //Zadatak (While petlja)
        //Napisati program koji validira unos lozinke
        // sve dok korisnik ne unese validnu.
        // Lozinka je validna ukoliko ima minimum 8
        // karaktera i sadrzi bar jedan od dva specijalna
        // karaktera a specijalni karakteri su @ i #
        //Primer izvrsenja:
        //Unesite lozinku: ITBootcamp
        //Lozinka nije validna.
        //Unesite lozinku: ITBootcamp12
        //Lozinka nije validna.
        //Unesite lozinku: ITBoo@
        //Lozinka nije validna.
        //Unesite lozinku: ITBootcamp@
        //Lozinka je validna.

        Scanner s = new Scanner(System.in);

        boolean lozinkaNeispravna = true;
        while (lozinkaNeispravna == true) {
            System.out.println("Unesite lozinku: ");
            String lozinka = s.next();
            if (lozinka.length() < 8 || (!lozinka.contains("@") && !lozinka.contains("#"))) {
                System.out.println("Lozinka nije validna.");
            } else {
                System.out.println("Lozinka je validna.");
                lozinkaNeispravna = false;
            }

        }
    }
}
