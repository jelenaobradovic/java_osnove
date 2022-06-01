package Vezbanje_26_05_22;

import java.util.ArrayList;

public class Hystory {
    //Klasu History koja ima:
    //niz stranica koje su posecene

    private ArrayList <HystoryPage> nizStranica= new ArrayList<>();


    //metoda otvori stranicu koja dodaje novi historypage u niz.

    public void otvoristranicu (HystoryPage stranica)
    {
        nizStranica.add( stranica);

    }
    //metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku

    public void obrisiStranicu (HystoryPage link)
    {
        for (int i = 0; i <this.nizStranica.size() ; i++)
        {
            if(link.equals(nizStranica.get(i).getLinkDoStranice()))
            {nizStranica.remove(i);}

        }
    }
    //metoda obrisi kolacice za link - metoda koja za homepage brise kolacice

    public void obrisiKolaciceLink (HystoryPage link)
    {
        for (int i = 0; i < this.nizStranica.size(); i++) {

        if(link.equals(nizStranica.get(i).getLinkDoStranice()))
        {nizStranica.get(i).obrisiKolaciceHP();}

        }}


    //metoda obrisi istoriju - metoda brise celu istoriju

    public void obrisiIstoriju ()
    {
        for (int i = 0; i < this.nizStranica.size(); i++) {
            nizStranica.remove(i);

        }
    }



    //metoda sacuvajKredencija - od parametara se prima naziv stranice i
    // username i password koji se cuvaju.



    //metoda pogledajIstoriju - stampa sve posecene stranice
    public void pogledajIstoriju ()
    {
        for (int i = 0; i < nizStranica.size(); i++) {
            System.out.println(this.nizStranica.get(i).getNazivStranice());

        }
    }
    //metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.

    public void obrisiSveKolacice ()
    {
        for (int i = 0; i < this.nizStranica.size(); i++) {

            if(!this.nizStranica.get(i).getPassword().equals(null)&&
                    !this.nizStranica.get(i).getUsername().equals(null))
            {this.nizStranica.get(i).obrisiKolaciceHP();}

        }
    }


    //metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice
    // za strnaice koje su ucitane u zadnjih sat vremena. Metoda kao
    // parametar prima trenutno vreme (sat i minut)
}
