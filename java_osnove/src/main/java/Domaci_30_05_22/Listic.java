package Domaci_30_05_22;

import java.util.ArrayList;

public class Listic {
    //Kreirati klasu Listic koja ima:
    //niz kombinacija - maksimalno 7 kombinacija

    private ArrayList<Kombinacija> nizKombinacija = new ArrayList<>();


    //metodu dodaj kombinaciju, koja dodaje kombinaciju u niz

    public void dodajKombinaciju(Kombinacija k) {
        this.nizKombinacija.add(k);
    }


    //metodu koja vraca da li je kombinacija dobitna.
    // Kao parametar se prosledjuje kombinacija za proveru.
    // Metoda prolazi kroz sve elemente niza i proverava
    // da li u nizu postoji prosledjena kombinacija.
    // Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
    //Zaglavlje metode
    //public boolean dobitna(Kombinacija dobitnaKombinacija)

    public boolean daLiJeListicDobitan(Kombinacija k) {
        int brojac = 0;
        for (int i = 0; i < this.nizKombinacija.size(); i++) {
            if (this.nizKombinacija.get(i).daLiJeIstaKombinacija(k)) {
                brojac++;
            }
        }
        if (brojac > 0) {
            return true;
        } else {
            return false;
        }
    }

    //metodu koja stampa listic u formatu
    //ID: id kombinacije
    //brojevi: 1, 3, 5, 14, 15, 21, 23
    //
    //ID: id kombinacije
    //brojevi: 1, 3, 5, 14, 15, 21, 23
    //
    //…… i tako za sve kombinacije

    public void stampaj ()
    {
        for (int i = 0; i < this.nizKombinacija.size() ; i++) {

            this.nizKombinacija.get(i).stampaj();
            System.out.println();
        }
    }
}
