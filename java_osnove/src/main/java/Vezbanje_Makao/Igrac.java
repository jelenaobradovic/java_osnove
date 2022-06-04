package Makao;

import java.util.ArrayList;

public class Igrac {
    //Kreirati klasu Igrac koja ima:
    //ime i prezime
    //niz karata.
    //konstuktor koji postavlja ime i prezime
    //getter za karte

    private String ImeIPrezime;
    private ArrayList<Karta> nizKarataIgrac = new ArrayList<>();

    public Igrac(String imeIPrezime) {
        ImeIPrezime = imeIPrezime;
    }

    public ArrayList<Karta> getNizKarataIgrac() {
        return nizKarataIgrac;
    }

    //metodu dodajKartu koja dodaje prosledjenu kartu u niz.

    public void dodajKartu(Karta k) {
        this.nizKarataIgrac.add(k);
    }

    //metodu da li postoji karta, koja vraca true/false ako
    // karta postoji u nizu. Metoda prime broj i znak karte.

    public boolean daLiPostojiKarta(Karta k) {
        boolean postoji = true;
        for (int i = 0; i < this.nizKarataIgrac.size(); i++) {

            if (k.getBroj() == this.nizKarataIgrac.get(i).getBroj() &&
                    k.getZnak().equals(this.nizKarataIgrac.get(i).getZnak())) {
                postoji = true;
            }
            postoji = false;
        }
        return postoji;
    }

    public boolean daLiPostojiKarta2(String znak, int broj) {
        boolean postoji = true;
        for (int i = 0; i < this.nizKarataIgrac.size(); i++) {

            if (this.nizKarataIgrac.get(i).getBroj()==broj &&
                    this.nizKarataIgrac.get(i).getZnak().equals(znak)) {
                postoji = true;
            }
            postoji = false;
        }
        return postoji;
    }
    //metodu odigrajKartu - metoda kao parametar prima broj
    // i znak karte koju treba da odigra. Metoda iz niza karata
    // pronalazi kartu izbacuje je iz niza i vraca kao povratnu vrednost metode.
    //Primer ako igrac ima karte [ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]
    //i pozove se metoda milan.odigraj(12, “srce”) metoda vraca objekat Karta koja ima 12 i srce.
    //Nakon izvrsenja metode stanje kod igraca je [ 10 /\ ] [ Q <> ] [ A *** ]



    public Karta odigrajKartu (String znak, int broj) {
        for (int i = 0; i < this.nizKarataIgrac.size(); i++) {
            Karta k;
            if (this.nizKarataIgrac.get(i).getBroj() == broj &&
                    this.nizKarataIgrac.get(i).getZnak().equals(znak)) {
                this.nizKarataIgrac.remove(i);
                return this.nizKarataIgrac.get(i);
            }

        }
        return null;
    }
        //metodu stampaj koja stampa podatke o igracu u formatu:
        //[Ime i prezime]
        //[Karte]
        //Primer:
        //Milan Jovanovic
        //[ J <3 ] [ 10 /\ ] [ Q <> ] [ A *** ]
    }
