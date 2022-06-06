package Domaci_03_06_Ambalaza;

public class Main {
    public static void main(String[] args) {

        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko
        // Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        SuperKartica s1 = new SuperKartica(25,"Ana Petrovic",26);

        Korpa k1 = new Korpa();
        k1.dodajAmbalazu(new StaklenaAmbalaza("125478", "Casa", 200,
                250,20, true,150));

        k1.dodajAmbalazu(new Tetrapak("12356", "mali tetrapak", 100, 120,
                false, 48));

        System.out.println("Cena korpe: "+k1.cenaKorpe(s1));
        System.out.println();

        Tetrapak t1 = new Tetrapak("2222","tetrapak 100ml", 100,
                110, false, 25);

        t1.stampaj();
        System.out.println("Tezina pakovanja: " + t1.tezinaPakovanja());
    }
}