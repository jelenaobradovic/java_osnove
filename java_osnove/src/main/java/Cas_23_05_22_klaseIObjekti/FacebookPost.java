package Cas_23_05_22_klaseIObjekti;

public class FacebookPost {

    //Kreirati klasu FacebookPost
    //opis
    //korisnik (referenca na korisnika koji je kreirao post)
    //konstrukore koje mislite da su vam potrebni
    //metoda print, stampa u formatu:
    //(ime) (prezime)
    //(opis post-a)
    //
    //U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

    private String opis;
    private Korisnik korisnik;

    public Korisnik getKorisnik(){return this.korisnik;}

    public FacebookPost ()
    {}

    public void setOpis(String opis)
    {this.opis=opis;}

    public String getOpis()
    {
        return this.opis;
    }

    public void stampa (){
        System.out.println(this.getKorisnik() + " " + this.opis);
    }


}
