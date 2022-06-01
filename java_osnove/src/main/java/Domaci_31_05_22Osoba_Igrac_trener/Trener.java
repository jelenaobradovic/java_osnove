package Domaci_31_05_22Osoba_Igrac_trener;

public class Trener extends Osoba{
    // Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
    //godine iskustva
    //tip trenera (kondicioni, za igru, pomocni, personalni)

    private int godineIskustva;
    private String tipTrenera;

    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.


    public Trener() {
    }

    @Override
    public void stampaj ()
    {super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);

    }
}
