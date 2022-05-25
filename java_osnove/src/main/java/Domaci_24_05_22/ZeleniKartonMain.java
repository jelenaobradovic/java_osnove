package Domaci_24_05_22;

import java.util.ArrayList;

public class ZeleniKartonMain {

    public static void main(String[] args) {
        //U glavnoj klasi:
        //kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

        ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<>();

        ZeleniKarton ispit1 = new ZeleniKarton(
                "Ana Petrovic", 1234, "OOP",
                "MilanJovanovic", 7);

        zeleniKartoni.add(ispit1);

        ZeleniKarton ispit2 = new ZeleniKarton(
                "Jovan Jovanovic", 458, "Java",
                "Milan JOvanovic", 8);

        zeleniKartoni.add(ispit2);

        ZeleniKarton ispit3 = new ZeleniKarton(
                "Ana Jovanovic", 1258, "Java S",
                "Milan JOvanovic", 7);

        zeleniKartoni.add(ispit3);

        ZeleniKarton ispit4 = new ZeleniKarton(
                "Jovan Jovanovic", 4448, "Selenium",
                "Milan JOvanovic", 8);

        zeleniKartoni.add(ispit4);

        ZeleniKarton ispit5 = new ZeleniKarton(
                "Ana Mitic", 2458, "Java",
                "Petar Petrovic", 6);

        zeleniKartoni.add(ispit5);

        ZeleniKarton ispit6 = new ZeleniKarton(
                "Jovan Jovanovic", 458, "OOP",
                "Petar Petrovic", 5);

        zeleniKartoni.add(ispit6);

        ZeleniKarton ispit7 = new ZeleniKarton(
                "Jovana Antic", 458, "Java S",
                "Milan JOvanovic", 10);

        zeleniKartoni.add(ispit7);

        ZeleniKarton ispit8 = new ZeleniKarton(
                "Nikola Nikolic", 458, "Java",
                "Milan JOvanovic", 9);

        zeleniKartoni.add(ispit8);


        for (int i = 0; i < zeleniKartoni.size(); i++) {
            zeleniKartoni.get(i).stampa();
            System.out.println();

        }

        int suma = 0;

        for (int i = 0; i < zeleniKartoni.size(); i++) {
            suma = suma + zeleniKartoni.get(i).getOcena();

        }
        double prosecnaOcena = suma / zeleniKartoni.size();
        System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);

        System.out.println();

        suma = 0;
        for (int i = 0; i < zeleniKartoni.size(); i++) {
            if (zeleniKartoni.get(i).prelaznaOcena() == true) {
                suma = suma + zeleniKartoni.get(i).getOcena();
            } else {
                suma = suma + 0;
            }
        }

        double prosekPrelaznihOcena = suma / zeleniKartoni.size();

        System.out.println("Prosek prelaznih ocena je: " + prosekPrelaznihOcena);

    }


}




