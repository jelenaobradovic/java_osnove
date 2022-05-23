package test_java;

public class zadatak_4 {
    public static void main(String[] args) {
        //Zadatak (Metode)
        //Napisati metodu koja vrsi konverziju metara
        // u cm, dm, km. Metoda kao parametre prima
        // vrednost u metrima i jedinicu u kojoj treba izvrsiti
        // konverziju i vraca konvertovanu vrednost.
        //Podsetnik za konverziju jedinica:
        //1m = 100 cm
        //1m = 10 dm
        //1m = 0.001 km
        //
        //Primer poziva metode
        //Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
        //Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
        //
        //U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.
        //
        //Primer izvrsenja programa:
        //3.5m je 350cm
        //3.5m je 35dm
        //3.5m je 0.0035km


        double vrednost = 3;
        String jedinica = "cm";
        double konvertovano = konverzija(vrednost, jedinica);
        System.out.println(vrednost + "m" + " je " + konvertovano + " " + jedinica);

        vrednost = 4;
        jedinica = "dm";
        konvertovano = konverzija(vrednost, jedinica);
        System.out.println(vrednost + "m" + " je " + konvertovano + " " + jedinica);

        vrednost = 4;
        jedinica = "km";
        konvertovano = konverzija(vrednost, jedinica);
        System.out.println(vrednost + "m" + " je " + konvertovano + " " + jedinica);
    }

    static double konverzija(double vrednost, String jedinica) {
        if (jedinica.equals("cm")) {
            double m = vrednost * 100 * 1.0;
            return m;
        } else if (jedinica.equals("dm")) {
            double m = vrednost * 10 * 1.0;
            return m;
        } else {
            double m = vrednost * 0.001;
            return m;
        }


    }
}
