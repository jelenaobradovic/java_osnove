package Domaci_31_05_22_Igrac_Karton;

public class IgracKartonOsoba_Main {
    public static void main(String[] args) {



        Karton karton1 = new Karton("zuti");
        Karton karton2 = new Karton("zuti");
        Karton karton3 = new Karton("crveni");


        Igrac igrac1 = new Igrac("Joca Jocic","2602984",1984, 15,
                "napad", true );
        Igrac igrac2= new Igrac("petar petrovic", "2503988",
                1988, 2, "odbrana", false);

        igrac1.dodajKarton(karton3);
        igrac1.dodajKarton(karton1);
        igrac1.dodajKarton(karton1);
        System.out.println(igrac1.brojZutihKartona());

        igrac1.stampaj();

    }
}
