package d_16_05_2022;

import java.util.Scanner;

public class zadatak_5 {
    public static void main(String[] args) {
        //(Za vezbanje )Napisati funkciju koja za pronalazi koliko
        // ima celih brojeve izmedju brojeva M i N.
        // Primer izvrsenja:
        //izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
        //izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite 2 broja: ");
        int x = s.nextInt();
        int y = s.nextInt();

        brojacIzmedju2Cifre(x, y);

    }

    static void brojacIzmedju2Cifre(int a, int b) {
        if (a > b) {
            System.out.println("Izmedju ove dve cifre ima: " + (a - b - 1) + " cifara.");
        } else if (b > a) {
            System.out.println("Izmedju ove dve cifre ima: " + (b - a - 1) + " cifara.");
        } else if (a == b) {
            System.out.println("Brojevi su isti, nema cifara izmedju!");
        }
    }
}


