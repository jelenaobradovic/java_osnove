package Domaci_31_05_22Osoba_Igrac_trener;

import java.util.ArrayList;
import java.util.Scanner;

public class MainOIT {
    public static void main(String[] args) {


        Igrac igrac1 = new Igrac("Jovan Jovanovic", "2205999",
                1999, 5, "napadac", true);

        Igrac igrac2 = new Igrac("petar Petrovic", "1104001",
                2001, 15, "odbrambeni", false);

        Trener trener1 = new Trener("Jova JOcic","2425970",
                1970, 8, "kondicioni");

        Trener trener2 = new Trener("Jelena Vuckovic", "2602984", 1984,
                6,"kondicioni");

        trener2.stampaj();
        igrac1.stampaj();

    }
}
