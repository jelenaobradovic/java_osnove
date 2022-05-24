package Domaci_16_05_2022;

public class zadatak_1 {
    public static void main(String[] args) {
        //Napisati metodu stampajVrednostZa10Vecu u
        // kojoj se stampa prosledjena vrednost za 10 veca.
        // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.


        int x = 20;
        System.out.println("Broj za 10 veci od broja x je: " + stampajVrednostYa10Vecu(x));
    }
    static int stampajVrednostYa10Vecu(int a)
    {a = a +10;
    return a;}
}
