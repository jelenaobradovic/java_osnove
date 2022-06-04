package Cas_03_06_IcePoint;

import java.util.ArrayList;

public abstract class Proizvod {

 //Kreirati abstraktnu klasu Proizvod koja ima:

    protected ArrayList <Dodatak>  nizDodataka = new ArrayList<>();
    // niz dodataka
    // metodu ubaciDodatak koja dodaje dodatak u niz

    public void ubaciDodatak (Dodatak x)
    {nizDodataka.add(x);}

    // metodu koja vraca cenu svih dodataka koje ima proizvod

    public double cenaSvihDodataka ()
    {double suma=0;
        for (int i = 0; i < this.nizDodataka.size(); i++) {
            suma=suma+ this.nizDodataka.get(i).getCena();
        }
        return suma;
    }

    // abstraktnu metodu ukupnu racunaj cenu

    public abstract double ukupnaCena ();

    // abstraktnu metodu stampaj

    public abstract void stampaj ();
}
