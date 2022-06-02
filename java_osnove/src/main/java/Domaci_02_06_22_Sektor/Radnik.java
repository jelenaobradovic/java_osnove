package Domaci_02_06_22_Sektor;

import java.util.ArrayList;

public abstract class Radnik {
    //Kreirati abstraktnu klasu Radnik koja ima:
    // ime i prezime
    // niz sektora u kojima radi

    protected String imeIPrezime;
    protected ArrayList <Sektor> nizSektora = new ArrayList<>();

    // abstraktnu metodu koja vraca platu radnika

    public abstract double plataRadnika();

    // metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

    public void zaposliUSektor (Sektor s)
    {this.nizSektora.add(s);}
}
