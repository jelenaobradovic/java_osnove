package Domaci_23_05_22;

public class Proizvod {

    //(Za vezbanje) Kreirati klasu Proizvod koja ima:
    //sifru proizvoda
    //naziv proizvoda
    //cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
    //konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
    //gettere i settere za sifru i naziv
    //setter za cenu po kilogramu


    private String sifra;
    private String naziv;
    private int cenaPoKg;

    public Proizvod(String sifra, String naziv, int cenaPoKg) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKg = cenaPoKg;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaPoKg(int cenaPoKg) {
        this.cenaPoKg = cenaPoKg;
    }
    //  //metodu getCenaKg koja vraca cenu za 1 kg proizvoda


    public int getCenaKg ()
    {return this.cenaPoKg;}

    //    //metodu getCenaLb koja vraca cenu za 1lb prozvoda
    //    // 		konverzija: 1 kg = 2.2046 lb

    public double cenaPOLb ()
    {double cenaPoLb = getCenaKg()*2.2046;
    return cenaPoLb;}



    //    //metodu koja stampa proizvod u formatu:
    //    //(sifra) - (naziv)

    public void stampa ()
    {
        System.out.println(this.sifra + " - " + this.naziv);
    }

}
