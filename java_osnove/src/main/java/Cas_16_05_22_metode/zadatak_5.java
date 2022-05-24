package Cas_16_05_22_metode;

public class zadatak_5 {
    public static void main(String[] args) {
        //5. Zadatak
        //Napisati metodu stampajApsolutnuVrednost,
        // koja stampa apsolutnu vrednost   prosledjene vrednosti.

        int x= -6;
        apsolutaVrednost(x);

    }

    static void apsolutaVrednost (int a) {
        if (a<0){
            a=a*(-1);
            System.out.println("Apsolutna vrednost broja je:" + a );
        }
        else
        {
            System.out.println("Apsolutna vrednost broja je: " + a);

        }
    }
}
