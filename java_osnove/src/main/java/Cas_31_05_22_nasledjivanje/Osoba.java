package Cas_31_05_22_nasledjivanje;

public class Osoba {

    //		Kreirati klasu Osoba koja od atributa ima:
    // ime i prezime
    // jmbg
    //konstuktor sa parametrima
    //metodu stampaj koja stampa podatke u formatu
    //			ime prezime, jmbg

    protected String imeIPrezime;
    protected String jMBG;

    public Osoba(String imeIPrezime, String jMBG) {
        this.imeIPrezime = imeIPrezime;
        this.jMBG = jMBG;
    }

    public void stampaj ()
    {
        System.out.println("Puno ime: " + this.imeIPrezime+ " JMBG: "+ this.jMBG);
    }
}
