package Makao;

import java.util.ArrayList;
import java.util.Random;

public class Spil {
    //Kreirati klasu Spil koja ima:
    //niz karata - nemamo ni getter ni setter za ovaj atribut.

    private ArrayList<Karta> spil = new ArrayList<>();

    //difoltni konstuktor koji kreira niz karata.
    // Ovaj konstuktor NE PRIMA PARAMETRE!.
    // U konstukrotu kreiramo niz karata tako sto dodajemo 52 karte, rucno!.
    //Primer:
    //karte.add(new Karta(2, “srce”));
    //karte.add(new Karta(2, “kocka”));
    //….

    public Spil() {spil.add(new Karta());}


    //metodu izvuci random kartu iz spila koja vraca
    // OBJEKAT koji je tipa Karta. Za uzimanje random
    // elementa iz liste imate koristan link. Nakon sto nadjete random
    // kartu izbacite je iz niza, a zatim je vratite kao povratnu vrednost metode.
    //Primer izvrsenja:
    //Karta k = spil.izvuciRandom();
    //k.stampaj() => stampa se na primer [ A <3 ]

    public Karta izvuciKartu ()
    {
        Random randomBroj = new Random();int pickedNumber = randomBroj.nextInt (52);
        this.spil.remove(pickedNumber);
        return this.spil.get(pickedNumber);

    }
}
