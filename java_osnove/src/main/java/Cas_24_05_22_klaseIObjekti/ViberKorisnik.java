package Cas_24_05_22_klaseIObjekti;

public class ViberKorisnik {
    //Kreirati klasu ViberKorisnik koja ima:
    //ime i prezime
    //broj telefona
    //da li je trenutno aktivan (boolean)
    //gettere, settere, konstuktore

    private String imeIPrezime;
    private String brojTelefona;
    private boolean aktivan;

    public ViberKorisnik() {
    }

    public ViberKorisnik(String imeIPrezime, String brojTelefona, boolean aktivan) {
        this.imeIPrezime = imeIPrezime;
        this.brojTelefona = brojTelefona;
        this.aktivan = aktivan;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }
}
