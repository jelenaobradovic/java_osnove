package Cas_24_05_22_klaseIObjekti;

public class ViberPoruka {
//Kreirati klasu ViberPoruka koja ima:
//tekst poruke
//vreme kad je poslata poruka
//korisnika koji je poslao poruku
//korisnika kome je poslata poruka
//gettere i setere i konstuktore
//rekaciju na poruku


    private String tekst;
    private String vremeObjave;
    private ViberKorisnik korisnikZaKogaJePoruks;
    private ViberKorisnik korisnikKojiSalje;
    private ViberReakcija reakcija1;

    public ViberPoruka(String tekst, String vremeObjave,
                       ViberKorisnik korisnik1, ViberKorisnik korisnik2,
                       ViberReakcija reakcija1)
    {
        this.tekst = tekst;
        this.vremeObjave = vremeObjave;
        this.korisnikZaKogaJePoruks = korisnik1;
        this.korisnikKojiSalje = korisnik2;
        this.reakcija1 = reakcija1;
    }

    public ViberPoruka() {
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getVremeObjave() {
        return vremeObjave;
    }

    public void setVremeObjave(String vremeObjave) {
        this.vremeObjave = vremeObjave;
    }

    public ViberKorisnik getKorisnikZaKogaJePoruks() {
        return korisnikZaKogaJePoruks;
    }

    public void setKorisnikZaKogaJePoruks(ViberKorisnik korisnikZaKogaJePoruks) {
        this.korisnikZaKogaJePoruks = korisnikZaKogaJePoruks;
    }

    public ViberKorisnik getKorisnikKojiSalje() {
        return korisnikKojiSalje;
    }

    public void setKorisnikKojiSalje(ViberKorisnik korisnikKojiSalje) {
        this.korisnikKojiSalje = korisnikKojiSalje;
    }

    public ViberReakcija getReakcija1() {
        return reakcija1;
    }

    public void setReakcija1(ViberReakcija reakcija1) {
        this.reakcija1 = reakcija1;
    }

    //metodu prikazi koja stampa podatke o poruci u formatu:
//From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
//To: [Ime i prezime korisnika kome je poslata]
//[Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
//
//POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
//if (this.reakcija != null)



}
