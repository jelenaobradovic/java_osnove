package Domaci_24_05_22;

public class ElektricniSporetRinglaMain {
    public static void main(String[] args) {

        Ringla ringla1 = new Ringla("obicna", 8.1);
        Ringla ringla2 = new Ringla("ekspres", 16);
        Ringla ringla3 = new Ringla("obicna", 8);
        Ringla ringla4 = new Ringla("ekspres", 24);

        ElektricniSporet bosch2564 = new ElektricniSporet("bosch", 2, 3,
                ringla1, ringla2, ringla1, ringla4);

        ElektricniSporet beko = new ElektricniSporet("beko", 3, 2,
                ringla1, ringla4, ringla3, ringla2);

        ringla2.pojacajRinglu();
        ringla2.pojacajRinglu();
        System.out.println(ringla2.getJacinaRingle());
        ringla2.stampa();
        ringla3.pojacajRinglu();
        ringla4.pojacajRinglu();
        ringla3.stampa();
        ringla4.stampa();
        ringla4.potrosnjaElEnergije(2);


        System.out.println(ringla2.potrosnjaElEnergije(2.2));



    }
}
