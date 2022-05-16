package java_probni_test;

import java.util.Scanner;

public class zadatak_2 {
    public static void main(String[] args) {
//        2. Napisati program koji simulira korigovanje jacine zvuka na jutjubu.
//        Podrazumevana vrednost za jacinu zvuka, u trenutku kada se ucita video, je 75%. Korisnik
//        unosi akcije koje uticu na jacinu zvuka sve dok ne unese PLAY. Dozvoljene akcije su:
//● up - akcija povecava jacinu zvuka za 10%
//● down - akcija smanjuje jacinu zvuka za 10%
//● mute - akcije postavlja jacinu zvuka na 0%
//        Jacina zvuka u bilo kom trenutku maksimalno moze biti 100% i minimalno 0%.Na kraju
//        programa ispisati jacinu zvuka.
//        Primer izvrsenja 1:
//        Akcija: up Akcija: up Akcija: up Akcija: down Akcija: PLAY
//        Jacina zvuka je 90 %.

//        Primer izvrsenja loseg programa:
//        Akcija: up
//        Akcija: up
//        Akcija: up
//        Akcija: down
//        Akcija: PLAY
//        Jacina zvuka je 95%.
//        Primer izvrsenja 2:
//        Akcija: up
//        Akcija: mute
//        Akcija: up
//        Akcija: down
//        Akcija: down
//        Akcija: PLAY
//        Jacina zvuka je 0%.


        Scanner s = new Scanner(System.in);
        int jacinaZvuka = 75;
        boolean play = true;
        while (play == true) {
            System.out.println("Unesite akciju: upa/down/play");
            String akcija = s.next();
            if (akcija.equals("up") && jacinaZvuka + 10 <= 100) {
                jacinaZvuka = jacinaZvuka + 10;
            } else if (akcija.equals("down") && jacinaZvuka - 10 >= 0) {
                jacinaZvuka = jacinaZvuka - 10;
            } else if (akcija.equals("play")){
                play = false;

            }


        }
        System.out.println("Jacina zvuka je :" + jacinaZvuka);
    }


}

