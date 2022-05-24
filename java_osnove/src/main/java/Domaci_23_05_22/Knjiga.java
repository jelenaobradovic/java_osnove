package Domaci_23_05_22;

public class Knjiga {
    //Kreirati klasu Knjiga koji ima:
    //-ISBN
    //-naziv
    //-godina izdanja
    //-autor
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute

    //	U glavnom programu napraviti vise autora sa vise knjiga.

    private String iSBN;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga(String iSBN, String naziv, int godinaIzdanja, Autor autor) {
        this.iSBN = iSBN;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public Knjiga() {
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    ////-metodu print koja stampa u formatu (izbegavati dupliranje koda):
    //    //(ISBN)
    //    //(naziv) - (godina izdanja)
    //    //autor: (ime autora) (prezime autora)

    public void stampa() {
        System.out.println("ISBN: " + this.iSBN);
        System.out.println(this.naziv + " - " + this.godinaIzdanja);
        System.out.println("Autor: " + this.autor.getIme() + " " + this.autor.getPrezime());
    }
}
