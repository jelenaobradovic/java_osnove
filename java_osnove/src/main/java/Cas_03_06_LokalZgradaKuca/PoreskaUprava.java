package Cas_03_06_LokalZgradaKuca;

import java.util.ArrayList;

public class PoreskaUprava {
    //Kreirati klasu PoreskaUprava koja za atribute ima:
    //ime grada u kom se nalazi
    //niz objekata

    private String imeGrada;
    private ArrayList<Objekti> nizObjekata = new ArrayList<>();

    //metodu dodaj objekat

    public void dodajObjekat(Objekti o) {
        nizObjekata.add(o);
    }

    //metodu koja vraca objekat sa najvecim porezom

    public Objekti najveciPorez() {
        double najveciPorez = 0;
        int index = 0;
        for (int i = 0; i < nizObjekata.size(); i++) {

            double x = this.nizObjekata.get(i).izracunajPorez();
            if (x > najveciPorez) {
                najveciPorez = x;
                index = i;
            }

        }
        return nizObjekata.get(index);
    }


//metodu koja vraca objekat sa najmanjim porezom

    public Objekti najmanjiPoprez() {
        Objekti objekat1 = nizObjekata.get(0);
        double najmanjiPorez = objekat1.izracunajPorez();
        int index =0;
        for (int i = 1; i < this.nizObjekata.size(); i++) {
            if (this.nizObjekata.get(i).izracunajPorez()<najmanjiPorez)
            {najmanjiPorez=this.nizObjekata.get(i).izracunajPorez();
            index=i;}

        }
        return this.nizObjekata.get(index);

    }


//metodu koja racuna ukupan porez za ceo grad

    public double ukupanPorez ()
    {double suma = 0;
        for (int i = 0; i < this.nizObjekata.size(); i++) {
            suma= suma+this.nizObjekata.get(i).izracunajPorez();

        }

    return suma;
    }




//metodu koja stampa sve objekte


    public void stampaPU ()
    {
        System.out.println("Svi objekti poreske uprave: ");
        for (int i = 0; i < this.nizObjekata.size(); i++) {

            this.nizObjekata.get(i).stampaj();
        }
        System.out.println();
    }
}
