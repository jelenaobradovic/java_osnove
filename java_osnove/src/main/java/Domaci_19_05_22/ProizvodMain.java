package Domaci_19_05_22;

public class ProizvodMain {

    public static void main(String[] args) {
        Proizvod brasno = new Proizvod();

        brasno.nazivProizvoda = "brasno";
        brasno.cenaProizvoda = 90.3;
        brasno.tezinaproizvoda_gr = 1000;

        double povecajCenu = 23.3;
        int popust = 25;

        brasno.stampaj();
        brasno.povecajCenu(povecajCenu);
        brasno.stampaj();
        brasno.racunajPostarinu();
        double cenaSaPopustom = brasno.vratiCenuSaPopustom(popust);
        System.out.println("Cena sa popustom je: "+ cenaSaPopustom);

        Proizvod mleko = new Proizvod();

        mleko.nazivProizvoda = "mleko";
        mleko.cenaProizvoda = 120;
        mleko.tezinaproizvoda_gr = 900;

        povecajCenu = 10;
        popust = 15;

        mleko.stampaj();
        mleko.povecajCenu(povecajCenu);
        mleko.stampaj();
        mleko.racunajPostarinu();
        cenaSaPopustom = mleko.vratiCenuSaPopustom(popust);
        System.out.println("Cena sa popustom je: "+ cenaSaPopustom);

    }
}
