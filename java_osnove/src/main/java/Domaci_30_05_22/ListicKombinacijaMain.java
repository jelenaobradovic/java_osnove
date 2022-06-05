package Domaci_30_05_22;

public class ListicKombinacijaMain {

    public static void main(String[] args) {

        Kombinacija dobitnaK = new Kombinacija("k1komb", 1,5,15,
                17,25,32,39);
        Kombinacija k2 = new Kombinacija("k2komb",10,12,
                16,18,22,25,32);

        Kombinacija k3 = new Kombinacija("k3komb",1,5,7,
                9,15,17,25);

        Listic l1 = new Listic();
        l1.dodajKombinaciju(k2);
        l1.dodajKombinaciju(k3);
        l1.dodajKombinaciju(dobitnaK);

        l1.stampaj();

        if (l1.daLiJeListicDobitan(dobitnaK)==true)
        {
            System.out.println("Listic je dobitan");
        }
        else{System.out.println("Listic nije dobitan");}

    }
}
