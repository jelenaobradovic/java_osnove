package Cas_03_06_IcePoint;

public class Ice_Point extends Proizvod {

    //Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
    // tip sladoleda (vanila, cokolada)
    // atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)

    private String ukusSladoleda;
    private boolean daLiJeMaliIcePoint;

    public Ice_Point(String ukusSladoleda, boolean daLiJeMaliIcePoint) {
        this.ukusSladoleda = ukusSladoleda;
        this.daLiJeMaliIcePoint = daLiJeMaliIcePoint;
    }

    public String getUkusSladoleda() {
        return ukusSladoleda;
    }

    public boolean isDaLiJeMaliIcePoint() {
        return daLiJeMaliIcePoint;
    }
    // override uje metodu koja ukupnu cenu racuna:
    //ako je mali ice point na cenu svih dodataka doda 100
    //ako je veliki ice point cenu svih dodataka doda 130

    @Override
    public double ukupnaCena() {
        if (this.daLiJeMaliIcePoint)

        {return this.cenaSvihDodataka()+100;}
        return this.cenaSvihDodataka()+130;
    }

    @Override
    public void stampaj() {

        System.out.print("Dodaci: ");

        System.out.println(this.ukusSladoleda);

        for (int i = 0; i < this.nizDodataka.size(); i++) {
            System.out.print(this.nizDodataka.get(i).getDodatak()+ ", ");
        }
        System.out.println();

        if (daLiJeMaliIcePoint)
        {
            System.out.println("Mali IcePoint");
        } else {
            System.out.println("Veliki IcePoint");
        }

    }


    //override uje metodu stampaj da stampa sve podatke
}
