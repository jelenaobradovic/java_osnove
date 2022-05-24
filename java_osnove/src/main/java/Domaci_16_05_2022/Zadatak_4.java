package Domaci_16_05_2022;

import java.util.Scanner;

public class Zadatak_4 {
    public static void main(String[] args) {
        //Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        //Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>/ / / / /

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = s.nextInt();
        System.out.println("Unesite karakter:");
        String karakter = s.next();

        stampaKaraktera(n, karakter);
    }

    static void stampaKaraktera(int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");

        }
    }
}
