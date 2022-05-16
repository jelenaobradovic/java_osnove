package d_16_05_2022;

public class zadatak_2 {
    public static void main(String[] args) {
//        //
//        Napisati funkciju koja za dva jednocifrena broja
//        koja su ulazni parametri funkcije vraca novu vrednost
//        koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        String a = "2";
        String b = "6";


        System.out.println("Novi broj sa ciframa a i b je: " + spojCifre(a, b));

    }

    static String spojCifre(String a, String b) {
        String c = a + b;
        return c;
    }
}
