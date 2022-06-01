package Domaci_31_05_22_Igrac_Karton;

import java.util.ArrayList;

public class Igrac extends Osoba {


    //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
    //broj (broj koji igrac nosi)
    //poziciju koju igra (odbrambeni, napadac, … )
    //niz kartona
    //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)

    private int brojdresa;
    private String pozicija;
    private ArrayList <Karton> nizKartona=new ArrayList<>();
    private boolean daLiJeKapiten;

    //default-ni konstuktor
    //konstuktor sa parametrima
    //gettere i settere za broj, kapiten i poziciju

    public Igrac() {
    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int brojdresa,
                 String pozicija, boolean daLiJeKapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.brojdresa = brojdresa;
        this.pozicija = pozicija;
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public int getBrojdresa() {
        return brojdresa;
    }

    public void setBrojdresa(int brojdresa) {
        this.brojdresa = brojdresa;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }
    //metodu dodaj karton, gde se dodaje karton u niz

    public void dodajKarton (Karton karton)
    {nizKartona.add(karton);}

    //metodu koja vraca broj zutih kartona

    public int brojZutihKartona ()
    {int brojac= 0;
        for (int i = 0; i < this.nizKartona.size(); i++)
        {if (this.nizKartona.get(i).getTipKartona().equals("zuti"))
        {brojac++;}}
    return brojac;}

    //metodu koja vraca broj crvenih kartona

    public int brojCrveniKartona ()
    {int brojac= 0;
        for (int i = 0; i < this.nizKartona.size(); i++)
        {if (this.nizKartona.get(i).getTipKartona().equals("crveni"))
        {brojac++;}}
        return brojac;}

    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    @Override
    public void stampaj ()
    {super.stampaj();
        System.out.println("Broj dresa:" + this.brojdresa);
        System.out.println("Pozicija: " + this.pozicija);
        System.out.println("Igrac je kapiten :" + this.daLiJeKapiten);
        System.out.println("Broj zutih kartona:"+ this.brojZutihKartona());
        System.out.println("Broj crvenih kartona: " + this.brojCrveniKartona());
    }
}
