package Domaci_02_06_22_Sektor;

import java.util.ArrayList;

public class Main_Sektor {
    public static void main(String[] args) {
      //U glavnom programu kreirati jednog magacionera i
        // jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

    Sektor lekovi = new Sektor("Lekovi", 55000);
    Sektor kozmetika = new Sektor("Kozmetika", 50000);
    Sektor medPomagala = new Sektor("Medicinska pomagala", 45000);

    Radnik r1 = new Menadzer();
    r1.imeIPrezime= "Petar Petrovic";
    r1.zaposliUSektor(kozmetika);
    r1.zaposliUSektor(lekovi);


    Radnik r2 = new Magacioner();
    r2.imeIPrezime = "Jovan JOvanovic";
    r2.zaposliUSektor(medPomagala);
    r2.zaposliUSektor(lekovi);


    ArrayList<Radnik> nizRadnika=new ArrayList<>();
    nizRadnika.add(r1);
    nizRadnika.add(r2);

        for (int i = 0; i < nizRadnika.size(); i++) {
            System.out.println("Prosecna plata radnika:"+ nizRadnika.get(i).imeIPrezime
                    + " je " + nizRadnika.get(i).plataRadnika());

        }




    }
}
