package Domaci_20_05;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class FacebookPost {
    //Od atributa:
    //ime i prezime korisnika koji je objavio post
    //ime i prezime korisnika na kom je profilu objavljen
    // post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
    //tekst objave
    //broj lajkova
    //broj deljenja
    // Konstruktore:
    //difoltni konstuktor
    //konstuktor koji postavlja ime i prezime korisnika
    // ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
    //  Od metoda:
    //like(), koja povecava broj lajkova za 1.
    //dislike(), koja smanjuje broj lajkova za 1
    // (broj lajkova ne moze da bude manji od nule)
    //share(), koja povecava broj deljenja za 1
    //print(), koja stampa objavu u formatu:
    //(ime i prezime osobe koja je objavila) >>>
    // (ime i prezime na cijem profilu)
    //(tekst objave)
    //Likes (broj lajkova) | Shares (broj deljenja)
    //
    //U glavnoj klasi napraviti minimum dva FacebookPost-a
    // i nad svakim pozvati svaku funkciju.


    String imeIPrezimeKoPostuje;
    String imeIPrezimeKomeJePOstovano;
    String tekstObjave;
    int brojLajkova;
    int brojDeljenja;


    public FacebookPost ()
    {

    }

    public FacebookPost(String imeIPrezimeKoPostuje, String imeIPrezimeKomeJePOstovano, String tekstObjave, int brojLajkova, int brojDeljenja)
    {this.imeIPrezimeKoPostuje=imeIPrezimeKoPostuje; this.imeIPrezimeKomeJePOstovano=imeIPrezimeKomeJePOstovano; this.tekstObjave=tekstObjave; this.brojLajkova=brojLajkova;this.brojDeljenja=brojDeljenja;}




    public void like() {
        this.brojLajkova++;
    }

    public void dislike() {
        this.brojLajkova--;
    }

    public void share() {
        this.brojDeljenja++;
    }

    public void print() {
        System.out.print(this.imeIPrezimeKoPostuje + " >> " + this.imeIPrezimeKomeJePOstovano);
        System.out.println(" "+ this.tekstObjave);
        System.out.println("Likes: " + this.brojLajkova+ " | Shares: " + this.brojDeljenja);


    }
}


