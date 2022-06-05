package Domaci_24_05_22;

public class ElektricniSporetRinglaMain {
    public static void main(String[] args) {

        Ringla ringla1 = new Ringla("obicna", 1.2);
        Ringla ringla2 = new Ringla("ekspres", 0.8);
        Ringla ringla3 = new Ringla("obicna", 1.8);
        Ringla ringla4 = new Ringla("obicna", 1.2);

        ElektricniSporet bosch2564 = new ElektricniSporet("bosch", 2, 3,
                ringla1, ringla2, ringla1, ringla4);

        ElektricniSporet beko = new ElektricniSporet("beko", 3, 2,
                ringla1, ringla4, ringla3, ringla2);

        ringla2.pojacajRinglu();
        ringla2.pojacajRinglu();
        System.out.println(ringla2.getJacinaRingle());
        ringla2.stampa();
        System.out.println(ringla2.potrosnjaElEnergije(2.2));

        beko.pojacaj(1);
        beko.pojacaj(2);
        beko.pojacaj(3);


        beko.stamaj();


    }
}
