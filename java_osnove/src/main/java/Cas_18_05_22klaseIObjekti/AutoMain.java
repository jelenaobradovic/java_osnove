package Cas_18_05_22klaseIObjekti;

public class AutoMain {
    public static void main(String[] args) {
        int ogranicenje = 80;

        Auto podaci1 = new Auto();

        podaci1.vozac = "Jovan Jovanovic";
        podaci1.marka = "Seat";
        podaci1.brojVrata = 5;
        podaci1.potrosnjaNa100km = 7;
        podaci1.trenutnaBrzina = 75;
        podaci1.daLiJeUkljucenaKlima = true;
        podaci1.registracija0="Ni 123456";
        podaci1.godinaproizvodnje=1949;

        int trenutniMesec = 12;


        podaci1.dodajGas();

        podaci1.cenaRegistracije();

        if (podaci1.daLijeAutoOldtimer()==true)
        {
            System.out.println("Auto registracije: "+ podaci1.registracija0+ " je oldtimer.");
        }
        else
        { System.out.println("Auto registracije: "+ podaci1.registracija0+ " nije oldimer.");}

        if(podaci1.daLiJeAutoRegistrovan(trenutniMesec)==true)
        {
            System.out.println("Auto se registrovan");
        }else
        {
            System.out.println("Auto nije registrovan");
        }

        if (podaci1.daLiJeBrzinaPrekoracena(ogranicenje) == true) {
            System.out.println("Brzina je prekoracena");
        } else {
            System.out.println("Brzina nije prekoracena");
        }

        System.out.println("Trenutna potrosnja je:" + podaci1.trenutnaPotrosnja());

        System.out.println("Kazna za prekora'enje je: " + podaci1.kazna(ogranicenje));
        System.out.println();


        Auto audi1 = new Auto();

        audi1.vozac = "Ana Mitic";
        audi1.marka = "Audi";
        audi1.brojVrata = 5;
        audi1.potrosnjaNa100km = 10;
        audi1.trenutnaBrzina = 110;

        audi1.stampa();

        System.out.println("Kazna za prekora'enje je: " + audi1.kazna(ogranicenje));


//Dopuna 2)
//U okviru klase Auto, implementirati jos 2 metode:
//metoda koja vraca informaciju da li je vozac prekoracio brzinu.
// Kao parametar metode se prima ogranicenje (kao broj) a metoda
// vraca true ili false ako je trenutna brzina veca od ogranicenja.
//metoda koja vraca visinu novcane kazne za prekoracenje, za svaku
// jedinicu prekoracenja placa se 1000din. Metoda od parametara prima ogranicenje brzine
//U glavnom programu pozvati ove metode i odstmpajte neke poruke
// na osnovu informacija koje dobijete od njih.



    }


}
