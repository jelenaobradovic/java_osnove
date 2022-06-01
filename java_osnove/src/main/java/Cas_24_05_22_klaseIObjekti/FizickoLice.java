package Cas_24_05_22_klaseIObjekti;

public class FizickoLice {
    //Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
    //ime i prezime
    //broj licne karte
    //jmbg
    //podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
    //konstuktore
    //gettere i settere, jmbg ne sme da se menja
    //metodu stampaj, koja stmpa podatke u formatu:
    //ime i prezime, broj licne karte

    private String imeIPrezime;
    private String brojLK;
    private String jMBG;
    private boolean stariKupac;

    public FizickoLice(String imeIPrezime, String brojLK, String jMBG, boolean stariKupac) {
        this.imeIPrezime = imeIPrezime;
        this.brojLK = brojLK;
        this.jMBG = jMBG;
        this.stariKupac = stariKupac;
    }

    public FizickoLice() {

    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojLK() {
        return brojLK;
    }

    public void setBrojLK(String brojLK) {
        this.brojLK = brojLK;
    }

    public String getjMBG() {
        return jMBG;
    }


    public boolean isStariKupac() {
        return stariKupac;
    }

    public void setStariKupac(boolean stariKupac) {
        this.stariKupac = stariKupac;
    }

    public void stampa ()
    {
        System.out.println( imeIPrezime+ ", "+ brojLK);
    }
}
