package Domaci_30_05_22;

import java.util.ArrayList;
import java.util.Collections;

public class Kombinacija {

//    Za potrebe Lotto igre na srecu potrebno je
//    Kreirati klasu Kombinacija koja ima:
//    id kombinacije (String)
//    niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//    konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//    gettere za atribute Kombinacija(String id, int jedan, int dva, …)

    private String idKombinacije;
    private ArrayList niz7Brojeva = new ArrayList<>();

    public Kombinacija() {
    }

    public Kombinacija(String idKombinacije, int prviBroj, int drugiBroj, int treciBroj, int cetvrtiBroj,
                       int petiBroj, int sestiBroj, int sedmiBroj)
    {
        this.idKombinacije = idKombinacije;

        this.niz7Brojeva = new ArrayList<>();
        this.niz7Brojeva.add(prviBroj);
        this.niz7Brojeva.add(drugiBroj);
        this.niz7Brojeva.add(treciBroj);
        this.niz7Brojeva.add(cetvrtiBroj);
        this.niz7Brojeva.add(petiBroj);
        this.niz7Brojeva.add(sestiBroj);
        this.niz7Brojeva.add(sedmiBroj);
    }

    public String getIdKombinacije() {
        return idKombinacije;
    }

    public ArrayList getNiz7Brojeva() {
        return niz7Brojeva;
    }
//    metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//    Zaglavlje metode je:
//    public boolean daLiJeIstaKombinacija( Kombinacija k)
//    metoda vraca true ako su svi elementi na istim pozicija isti
//    npr: this [0] == k [0], this [1] == k [1] ….

    public boolean daLiJeIstaKombinacija (Kombinacija k)

    {int brojac =0;
        for (int i = 0; i < this.niz7Brojeva.size(); i++) {
            if(this.niz7Brojeva.get(i)==k.getNiz7Brojeva().get(i))
            {brojac++;}}
          if (brojac==7)
          {return true;}
          else{return false;}
        }


//    metodu za stampu koja stampa podatke u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23

    public void stampaj ()
    {   System.out.println("ID kombinacije: "+ this.idKombinacije);
        System.out.print("Brojevi: ");
        for (int i = 0; i < niz7Brojeva.size(); i++) {

            System.out.print(this.niz7Brojeva.get(i)+", ");

        }
    }

}
