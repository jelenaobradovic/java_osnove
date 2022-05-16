package c16_05_22_metode;

public class zadatak_9 {
    public static void main(String[] args) {
        //9.Zadatak
        //Napisati metodu koja vrsi konverziju rimske u arapske brojeve.
        //1 - I
        //2 - II
        //3 - III
        //4 - IV
        //5 - V
        //6 - VI
        //7 - VII
        //8 - VIII
        //9 - IX
        //10 - X
        //
        //Kao parametar se unosi vrednost rimkog broja a vraca se arapski.
        //Ako se unese VIII vraca se 8.
        //
        //VIII => 8

        String rimskiBroj = "V";
        System.out.println(konverzija(rimskiBroj));

    }

    static int konverzija(String rimski) {
        if (rimski.equals("I")) {
            int r = 1;
            return r;
        } else if (rimski.equals("II")) {
            int r = 2;
            return r;
        } else if (rimski.equals("III")) {
            int r = 3;
            return r;
        } else if (rimski.equals("IV")) {
            int r = 4;
            return r;
        } else if (rimski.equals("V")) {
            int r = 5;
            return r;
        } else if (rimski.equals("VI")) {
            int r = 6;
            return r;
        } else if (rimski.equals("VII")) {
            int r = 7;
            return r;
        } else if (rimski.equals("VIII")) {
            int r = 8;
            return r;
        } else if (rimski.equals("IX")) {
            int r = 9;
            return r;
        } else if (rimski.equals("X")) {
            int r = 10;
            return r;
        } else {
            int r = 0;
            return r;
        }
    }
}



