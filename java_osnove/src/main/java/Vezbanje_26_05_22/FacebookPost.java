package Vezbanje_26_05_22;

import java.util.ArrayList;

public class FacebookPost {
    //Kreirati klasu FacebookPost koja ima:
    //ime i prezime korisnika koji je stavio oglas
    //tekst objave
    //niz reakcija

    private String korisnikObjava;
    private String tekstObjave;

    private ArrayList<Reakcija> nizReakcija = new ArrayList<>();

    public FacebookPost(String korisnikObjava, String tekstObjave) {
        this.korisnikObjava = korisnikObjava;
        this.tekstObjave = tekstObjave;
    }

//metodu reaguj, koja dodaje reakciju u niz

    public void dodajreakciju(Reakcija reakcija) {
        nizReakcija.add(reakcija);
    }

    //(modifikacija za vezbu) Ukoliko se desi situacija
    // da jedan isti korisnik reaguje na post (tj. postoji rekacija
    // korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
    //Primer: Milan - lajkuje
    //	 Nemanja - lajkuje
    //	 Milan - daje srce
    //Post ima lajk od Nemanje i srce od Milana.



    public void dodajIliPromeniReakciju(Reakcija reakcija) {
        for (int i = 0; i < nizReakcija.size(); i++) {
            if (this.nizReakcija.get(i).getKorisnikReakcija().equals(reakcija.getKorisnikReakcija())) {
                nizReakcija.remove(i);
            }
        }
        this.nizReakcija.add(reakcija);
    }



    //privatnu metodu koja vraca broj reakcija odredjenog tipa
    // (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)

    private int brojacodredjenihReakcija(String reakcija) {
        int brojac = 0;
        for (int i = 0; i < this.nizReakcija.size(); i++) {

            if (this.nizReakcija.get(i).getTipReakcije().equals(reakcija)) {
                brojac++;
            }
        }
        return brojac;
    }


    //metodu stampaj koja stampa podatke u formatu:
    //ime i prezime
    //tekst objave
    //Smajli 10 | Like 15 | Srce 2

    public void stampa() {
        System.out.println(this.korisnikObjava);
        System.out.println(this.tekstObjave);
        System.out.print("Smajli " + brojacodredjenihReakcija("smajli") + " | ");
        System.out.print("Srce " + brojacodredjenihReakcija("srce") + " | ");
        System.out.println("Lajk " + brojacodredjenihReakcija("lajk") + " | ");
        System.out.println();
    }

}





