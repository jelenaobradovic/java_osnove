package Domaci_30_05_22;

import java.util.ArrayList;

public class Student {

    //broj indeksa
    //ime i prezime
    //tip studija (osnovne, master, doktorske)
    //niz ispita

    private int brojIndexa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();


    //konstuktore koje mislite da ce vam trebati
    //gettere i settere za indeks, ime i prezime, tip studija
    //getter za niz predmeta

    public Student() {
    }

    public Student(int brojIndexa, String imeIPrezime, String tipStudija) {
        this.brojIndexa = brojIndexa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
//metodu dodaj ispit u niz ispita

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }


    //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)

    public double prosekPolozenihIspita ()
    { int brojPolozenihIspita =0;
        int suma=0;
        for (int i = 0; i < this.ispiti.size(); i++) {

            if (this.ispiti.get(i).getOcena()>5)
            {suma=suma+this.ispiti.get(i).getOcena();
            brojPolozenihIspita++;}

        }
        return suma/brojPolozenihIspita*1.0;


    }


    //metodu stampaj koja stampa u formatu:
    //(broj indeksa) - (ime i prezime) - (tip studija)
    //Predmeti:
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //Prosecna ocena: (prosecna ocena)

    public void stampa ()
    {
        System.out.println(this.brojIndexa+ " - "+ this.imeIPrezime + " - "+ this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {

            this.ispiti.get(i).stampa();

        }

    }
}
