package Vezbanje_26_05_22;

public class HystoryPageHystoryMain {
    public static void main(String[] args) {

        HystoryPage hp1 = new HystoryPage("Discovery", "www.didcovery.com",
                2,22,null, null);

        HystoryPage hp2 = new HystoryPage("farmacy", "www.farmacy.com",
                3,32,"hejhej", "ehej");

        Hystory history = new Hystory();
        history.otvoristranicu(hp1);
        history.otvoristranicu(hp2);


        history.pogledajIstoriju();
        System.out.println();

        history.obrisiKolaciceLink("www.farmacy.com");
        history.pogledajIstoriju();
        System.out.println();
        history.otvoristranicu(hp1);
        System.out.println();
        history.pogledajIstoriju();
        history.obrisiIstoriju();
        System.out.println();
        history.pogledajIstoriju();
    }
}
