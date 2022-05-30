package Cas_4_05_22_klaseIObjekti;

public class UgovorFizickoLiceMain {
    public static void main(String[] args) {

        FizickoLice korisnik1 = new FizickoLice("Jovan Jovanovic", "232345", "12124589455", true);

        FizickoLice korisnik2 = new FizickoLice("Ana Petrovic", "545654", "23568978945", false);

        korisnik1.stampa();

        Ugovor prodaja1 = new Ugovor("24.05.2022.", 48000, "Pobedina 3, Nis", korisnik1, korisnik2 );

        double x= prodaja1.procenatZarade();
        System.out.println(x);

        double y = prodaja1.zaradaAgencije();
        System.out.println(y);


        prodaja1.stampa();
    }
}
