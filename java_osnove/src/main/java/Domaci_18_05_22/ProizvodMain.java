package Domaci_18_05_22;

public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod brasno = new Proizvod();

        brasno.nazivProizvoda = "Brasno";
        brasno.cenaProizvoda = 85.5;
        brasno.tezinaproizvoda_gr = 1000.0;

        brasno.stampaj();


        Proizvod secer = new Proizvod();

        secer.nazivProizvoda = "Secer";
        secer.cenaProizvoda = 125.5;
        secer.tezinaproizvoda_gr = 1000.0;

        secer.stampaj();
    }
}
