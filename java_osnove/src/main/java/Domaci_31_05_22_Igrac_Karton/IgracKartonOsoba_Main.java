package Domaci_31_05_22_Igrac_Karton;

public class IgracKartonOsoba_Main {
    public static void main(String[] args) {



        Karton karton1 = new Karton("Joca Jocic","2602984",1984, "zuti" );
        Karton karton2 = new Karton("Joca Jocic","2602984",1984, "zuti");
        Karton karton3 = new Karton("Joca Jocic","2602984",1984, "crveni");
        Karton karton4 = new Karton("Nikola Petrovic","2602984",1986, "crveni");
        Karton karton5 = new Karton("Petar Nikolic","2202989",1989, "zuti");

        Igrac igrac1 = new Igrac("Joca Jocic","2602984",1984, 15,
                "napad", true );
        Igrac igrac2= new Igrac("petar petrovic", "2503988",
                1988, 2, "odbrana", false);

        igrac1.dodajKarton(karton3);
        igrac1.dodajKarton(karton2);
        igrac1.dodajKarton(karton1);

        System.out.println(igrac1.brojZutihKartona());

        igrac1.stampaj();

    }
}
