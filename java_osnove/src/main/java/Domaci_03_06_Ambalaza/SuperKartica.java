package Domaci_03_06_Ambalaza;

public class SuperKartica {
    //broj kartice
    //ime i prezime vlasnika
    //popust (200, 500, … )
    //konstuktore (default-ni i sa parametrima)
    //gettere i settere


    private int brojKartice;
    private String imeIprezime;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(int brojKartice, String imeIprezime, double popust) {
        this.brojKartice = brojKartice;
        this.imeIprezime = imeIprezime;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
//metodu stampaj koja stampa karticu u formatu:
    //(broj kartice), (ime i prezime)

    public void stampajKarticu()
    {
        System.out.println("Broj kartice: "+ this.brojKartice);
        System.out.println("Ime i prezime: "+ this.imeIprezime);
    }
}
