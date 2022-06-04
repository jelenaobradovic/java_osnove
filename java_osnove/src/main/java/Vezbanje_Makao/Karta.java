package Makao;

public class Karta {
    //Klasa Karta koja ima:
    //broj - moze da ima jednu od vrednsoti 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
    //znak - moze da ima jednu od sledecih vrednosti srce, list, kocka ili detelina
    //konstuktor koji prima oba parametra.
    //gettere za oba atributa

    private int broj;
    private String znak;

    public Karta() {
        this.broj = broj;
        this.znak = znak;
    }

    public int getBroj() {
        return broj;
    }

    public String getZnak() {
        return znak;
    }
//metodu stampaj koja stampa kartu u formatu:
    //[ broj znak ] - i ove kockaste zagrade idu u print!
    //Primer stampe za zandar srce:
    //[ J <3 ]
    //Primer stampe za 10 list:
    //[ 10 /\ ]
    //Primer stampe za dama kocka:
    //[ Q <> ]
    //Primer stampe za kec detelina:
    //[ A *** ]
    //Dosta sam primera naveo, ali kapirate foru….ide broj karte
    // (za 11, 12, 13, 14 idu A, J, Q, K) pa znak cisto da simuliramo izgled

    public void stampaj ()
    {
        System.out.println("[");
        if (this.broj==11)
        {
            System.out.print("A ");
        } else if (this.broj==12) {
            System.out.print("J ");
        } else if (this.broj==13) {
            System.out.print("Q ");
        } else if (this.broj==14) {
            System.out.print("K ");
        }else {
            System.out.println(this.broj + " ");
        }
        if (this.znak.equals("srce"))
        {
            System.out.print("<3");
        } else if (this.znak.equals("list")) {
            System.out.print("/"+"\\");
        } else if (this.znak.equals("kocka")) {
            System.out.print("<>");
        } else {
            System.out.print("***");
        }

        System.out.println("]");
    }


    //metodu da li je moguce poklopiti kartu. Metoda kao parametar
    // primer broj i znak karte.Metoda vraca true/false, i kartu je moguce poklopiti samo ako su istog znaka ili su istog broja.
    //Karta karta = new Karta (11, “srce”);
    //Primer poziva karta.daLiJeMogucePoklopiti(11, “kocka”); // vraca true
    //Primer poziva karta.daLiJeMogucePoklopiti(12, “srce”); // vraca true
    //Primer poziva karta.daLiJeMogucePoklopiti(14, “detelina”); // vraca false
}
