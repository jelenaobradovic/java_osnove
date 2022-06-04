package Cas_03_06_Ice_Point;

public class Pica extends Proizvod{
    //
    //Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
    // cena podloge
    private double cenaPodloge;

    public Pica(double cenaPodloge) {
        this.cenaPodloge = cenaPodloge;
    }

    @Override
    public double ukupnaCena() {
        return this.cenaPodloge+ this.cenaSvihDodataka();
    }

    @Override
    public void stampaj() {

        System.out.print("Cena podloge: "+ this.cenaPodloge);
        System.out.println("Dodaci:");
        for (int i = 0; i < this.nizDodataka.size(); i++) {
            System.out.println(this.nizDodataka.get(i).getDodatak());

        }
        System.out.println();
    }


    // override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
    //override uje metodu stampaj da stampa sve podatke
    //


}
