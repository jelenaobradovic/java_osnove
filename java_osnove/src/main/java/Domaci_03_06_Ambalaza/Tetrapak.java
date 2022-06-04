package Domaci_03_06_Ambalaza;

public class Tetrapak extends Ambalaza {

//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni


    private boolean daLiSeReciklira;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
                    boolean daLiSeReciklira, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }


    //    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena

    @Override
    public double cenaArtikla() {
        if (this.isDaLiSeReciklira()) {
            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }

    }


//    metoda stampaj stampa sve podatke iz klase tetrapak.

    @Override
    public void stampaj() {

        System.out.println("Naziv artikla: " + this.nazivArtikla);
        System.out.println("Neto tezina i bruto tezina: " + this.netoTezina + ", " + this.brutoTezina);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Cena artikla sa koeficijentom za reciklazu: " + this.cenaArtikla());


    }
}
