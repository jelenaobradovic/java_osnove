package Cas_03_06_LokalZgradaKuca;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
//U glavnom programu napraviti jednu poresku upravu i u nju
// dodati minimum 3 razlicita objekta i istestirati sve metode.

       PoreskaUprava puNis = new PoreskaUprava();

        Zgrada z1 = new Zgrada("Vozdova 12", 2000, 2, 2);
        Zgrada z2 = new Zgrada("Pobedina 6", 56, 2, 5);
        Lokal l1 = new Lokal("Njegoseva 45", 20,1);
        Kuca k1 = new Kuca("Episkopska 22", 120,1,6);
        Kuca k2 = new Kuca("Knjazevacka 120", 220, 3,4);

        puNis.dodajObjekat(z1);
        puNis.dodajObjekat(k1);
        puNis.dodajObjekat(l1);

        z1.stampaj();
        double x = z1.izracunajPorez();
        System.out.println("Porez: "+ x);
        System.out.println();

        l1.stampaj();
        System.out.println("Porez: " + l1.izracunajPorez());
        System.out.println();

        System.out.println("Ukupan porez PU: " + puNis.ukupanPorez());
        System.out.println();
        System.out.println("Najmanji porez: "+ puNis.najmanjiPoprez().adresa);
        System.out.println();
        System.out.println("Najveci porez: "+ puNis.najveciPorez().adresa);
        System.out.println();
        puNis.stampaPU();
    }
}
