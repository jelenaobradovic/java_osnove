package Cas_4_05_22_klaseIObjekti;

public class Korisnik {
//
//    Kreirati klasu Korisnik koja ima:
//    ime i prezime
//    tip licence (basic/pro/premium)
//    konstruktore. Po difoltu korisnik ima basic licencu.
//    gettere i settere za sve atribute, sem za tip licence koja ne moze da se menja
//    metodu pretplati se koja postavlja licencu u zavisnosi od uplacene sume:
//    ako je uplata 100, postavlja licencu na “pro”
//    ako je uplata 150, postavlja licencu na “premium”
//    Metoda kao parametar prima vrednost uplate $100 ili $150
//    metodu ponisti pretplatu koja postavlja licencu na basic
//    metodu koja vraca maksimalnu duzinu trajanja video poziva u
//    zavisnosti od licence
//    ako je basic, vraca 40min
//    ako je pro, vraca 240min
//    ako je  premium, vraca 1440min
//    metodu za stampu koja stampa u formatu:
//    ime i prezime

    private String imeIPrezime;
    private String licenca;

    public Korisnik() {
        this.licenca = "Basic";
    }

    public Korisnik(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
        this.licenca = "Basic";
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getLicenca() {
        return licenca;
    }

    public void tipLicence(int uplata) {
        if (uplata == 100) {
            licenca = "pro";
        } else if (uplata == 150) {
            licenca = "premium";
        } else {
            licenca = "basic";
        }
    }

    public void ponistiPretplatu() {
        licenca = "basic";
    }

    public int trajanjePoziva() {
        if (licenca.equals("basic")) {
            int trajanjePoziva = 40;
            return trajanjePoziva;
        } else if (licenca.equals("pro")) {
            int trajanjePoziva = 240;
            return trajanjePoziva;
        } else if (licenca.equals("premium")){
            int trajanjePoziva = 1440;
            return trajanjePoziva;
        }
        else {return 0;}

//mora da se zavrsi sa else, da ima return
    }


    public void stampa() {
        System.out.println("Ime i prezime korisnika je:" + this.getImeIPrezime());
    }
}
