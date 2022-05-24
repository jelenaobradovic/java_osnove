package Cas_16_05_22_metode;

public class zadatak_2 {
    public static void main(String[] args) {
        //Zadatak
        //Napisati dve metode, jedna metoda sluzi
        // za stampanje imena a druga sluzi za stampanje prezimena.
        // U glavnom programu pozvati metode na izvrsenje tako da se
        // 5 puta ispise ime i prezime u istom redu.
        //Primer izvrsenja:
        //Milan Jovanovic
        //Milan Jovanovic
        //Milan Jovanovic
        //Milan Jovanovic
        //Milan Jovanovic

        for (int i = 0; i < 5 ; i++) {
            printIme();
            printPrezime();

        }

    }
    static void printIme(){
        System.out.print("Jelena ");}
        static void printPrezime (){
            System.out.println("Obradovic");
        }
    }
