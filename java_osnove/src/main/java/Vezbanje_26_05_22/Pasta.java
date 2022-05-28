package Vezbanje_26_05_22;

import java.util.ArrayList;

public class Pasta {
    //Kreirati klasu Pasta koja ima:
    //niz sastojaka


    ArrayList<Sastojak> pasta = new ArrayList<>();

    //defaultni konstruktor

    public Pasta() {
    }

    //metodu za dodavanje sastojka

    public void dodavanjeSastojaka(Sastojak sastojak) {
        pasta.add(sastojak);
    }


    //(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.

    public void brisanjeSastojaka(Sastojak sastojak) {
        for (int i = 0; i < this.pasta.size(); i++) {
            if (this.pasta.get(i).equals(sastojak)) {
                this.pasta.remove(i);
            }

        }
    }

    //metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka


    public double cenaPaste() {
        double cenaPaste = 0;
        for (int i = 0; i < this.pasta.size(); i++) {

            cenaPaste = cenaPaste + this.pasta.get(i).getCena();

        }
        return cenaPaste;
    }


    //metodu za stampu koja stampa podatke u formatu:
    //Pasta je sa sastojcima:
    //naziv - cena.din
    //naziv - cena.din
    //naziv - cena.din
    //Cena paste je cena.din

    public void stampa() {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < this.pasta.size(); i++) {
            System.out.println(this.pasta.get(i).getNaziv() + " - " + this.pasta.get(i).getCena());

        }
        System.out.println("Cena paste je : " + cenaPaste());
    }


    //U glavnom programu kreirati objekte i testirati funkcionalnosti

}
