package Cas_23_05_22_klaseIObjekti;

public class Korisnik {

    //2.Zadatak
    //Kreirati klasu Korisnik koja ima
    //ime
    //prezime
    //gettere i settere za ime i prezime
    //konstuktore koje mislite da su vam potrebni
    //metoda koja stampa u formatu:
    //(ime) (prezime)
    //
    //Kreirati klasu FacebookPost
    //opis
    //korisnik (referenca na korisnika koji je kreirao post)
    //konstrukore koje mislite da su vam potrebni
    //metoda print, stampa u formatu:
    //(ime) (prezime)
    //(opis post-a)
    //
    //U main metodi, kreirati jedan facebook post i jednog korisnika i pozvati svaku od metoda

    private String ime;
    private String prezime;

    public Korisnik() {

    }
    public Korisnik (String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;

    }

    public void setIme (String ime){
        this.ime=ime;
    }

    public String getIme() {
        return ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public String getPrezime ()
    {return prezime;}

    public void stampa()
    {
        System.out.println(this.ime + ", "+ this.prezime);
    }


}
