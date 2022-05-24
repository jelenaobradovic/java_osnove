package c23_05_22;

public class Proizvod {
//Kreirati klasu Proizvod koja ima
//Naziv proizvoda
//kupca/musteriju
//cenu izrade proizvoda
//gettere i settere
//konstruktore
//Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice

    private String naziv;
    private Kupac kupac;
    private int cenaIzrade;

    public Proizvod(String naziv, Kupac kupac, int cenaIzrade) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public double cenaProizvoda() {
        double cenaProizvoda = cenaIzrade * 1.9 * this.getKupac().getKartica().getPopust();
        return cenaProizvoda;

    }

    //Metodu za stampanje proizvoda u formatu:
//naziv proizvoda - cena
//ime i prezime - broj kartice

    public void stampa() {
        System.out.println(this.naziv + ", "
                + cenaProizvoda() + ", " + this.getKupac().getImeIPrezime() + ", "+ this.getKupac().getKartica().getBrojKartice());
    }


}