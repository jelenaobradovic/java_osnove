package java_probni_test;

import java.util.Scanner;

public class zadatak_4 {
    public static void main(String[] args) {
        //4.  Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj
        //konverziji. Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je potrebno
        //izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
        //U glavnom programu pozvati funkciju za neki od primera.
        //Primer poziva funkcija:
        //Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
        //Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
        //Primer izvrsenja main programa:
        //Unesite vrednost u eurima: 3
        //Unesite valutu za konverziju: RSD
        //3 EUR je 351.6339 RSD
        //Konverzija eura u druge valute:
        //1 EUR = 117.2113 RSD
        //1 EUR = 1.1821 USD
        //1 EUR =  89.2323 RUB


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost u eurima: ");
        double iznos = s.nextDouble();
        System.out.println("Unesite valutu RSD/USD/RUB");
        String valuta = s.next();
        double konvertovano = konverzijaEura(iznos, valuta);
        System.out.println(konvertovano);


    }

    static double konverzijaEura(double iznos, String valuta) {
        double konvertovano = 1.0;
        if (valuta.equals("RSD")) {
            konvertovano = iznos * 117.3;
            return konvertovano;
        } else if (valuta.equals("USD")) {
            konvertovano = iznos * 110.2;
            return konvertovano;
        } else {
            konvertovano = iznos * 69;
            return konvertovano;
        }
    }
}
