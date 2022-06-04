package Domaci_03_06_Ambalaza;

public class StaklenaAmbalaza extends Ambalaza {

//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni

    private int kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, int kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public void setKaucija(int kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    //    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
    @Override
    public double cenaArtikla() {
        if (this.isDaLiSePlacaKaucija())
        {return this.osnovnaCena*1.2+this.kaucija;}
        else {return this.osnovnaCena*1.2;}
    }
//    metoda stampaj stampa sve podatke iz klase staklena flasa.

    @Override
    public void stampaj() {
        System.out.println("Naziv artikla: " + this.nazivArtikla);
        System.out.println("Neto tezina i bruto tezina: " + this.netoTezina + ", " + this.brutoTezina);
        System.out.println("Barkod: " + this.barkod);
        System.out.println("Cena artikla sa koeficijentom za kauciju: " + this.cenaArtikla());
    }





}
