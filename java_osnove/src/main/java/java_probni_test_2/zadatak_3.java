package java_probni_test_2;

import java.util.ArrayList;

import java.util.Scanner;

public class zadatak_3 {
    public static void main(String[] args) {
        //3. Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
        //je odigrana loto kombinacija upravo dobitna kombinacija. Korisnik unosi dva niza oba duzine
        //7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
        //Program na kraju ispisuje da li je dobitna kombinacija.Primer poziva metoda:
        //Ako se unesu nizovi:
        //● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 29, 30, 32}
        //● Program stampa “Nije dobitna kombinacija”
        //Ako se metoda pozove za:
        //● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} vraca true.
        //● Program stampa “Jeste dobitna kombinacija”
        //Napomena: Resenje preko petlje nosi maksimalni broj poena, dok resenje bez petlji nosi 50%

        ArrayList<Integer> lotoKombinacija = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {

            System.out.print("Loto brojevi su, uneti po rastucem redosledu: ");
            int lotoBroj = s.nextInt();
            lotoKombinacija.add(i, lotoBroj);
        }
        ArrayList<Integer> nasaKombinacija = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Nasa kombinacija, uneta po rastucem redosledu: ");
            int nasBroj = s.nextInt();
            nasaKombinacija.add(i, nasBroj);
        }

        uporedjivanjeKombinacija(lotoKombinacija, nasaKombinacija);

    }

    static void uporedjivanjeKombinacija(ArrayList<Integer> lotoKombinacija, ArrayList<Integer> nasaKombinacija)

    {
        boolean dobitnakomb = true;

        for (int i = 0; i < 7; i++) {

            if (lotoKombinacija.get(i) == nasaKombinacija.get(i)) {
                dobitnakomb = true;
            } else {dobitnakomb = false;};

        }
        if (dobitnakomb == true) {
            System.out.println("Kombinacija je dobitna.");
        } else {
            System.out.println("Kombinacija je nedobitna");
        }
    }

    }


