package Cas_16_05_22_metode;

public class zadatak_7 {

    //7.Zadatak
    //Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
    // Metoda prima broj N i vraca ga sa negativnom vrednoscu.
    //Primer: Ako se metoda pozove za N=10, vraca -10
    //	Ako se metoda pozove za N=-11, vraca 11

    public static void main(String[] args) {

        int n = 16;
        System.out.println(negativnVrednost(n));
    }

    static int negativnVrednost(int a) {
        int nv = -a;
        return nv;
    }
}
