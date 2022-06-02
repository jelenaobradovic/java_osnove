package Domaci_02_06_22_Sektor;

public class Main_Sektor {
    public static void main(String[] args) {
      //U glavnom programu kreirati jednog magacionera i
        // jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

    Sektor lekovi = new Sektor("Lekovi", 55000);
    Sektor kozmetika = new Sektor("Kozmetika", 50000);
    Sektor medPomagala = new Sektor("Medicinska pomagala", 45000);

    Menadzer menadzer1 = new Menadzer();
    menadzer1.imeIPrezime= "Petar Petrovic";
    menadzer1.zaposliUSektor(kozmetika);
    menadzer1.zaposliUSektor(lekovi);

        System.out.println(menadzer1.plataRadnika());

    Magacioner magacioner1 = new Magacioner();
    magacioner1.imeIPrezime = "Jovan JOvanovic";
    magacioner1.zaposliUSektor(medPomagala);
    magacioner1.zaposliUSektor(lekovi);

        System.out.println(magacioner1.plataRadnika());



    }
}
