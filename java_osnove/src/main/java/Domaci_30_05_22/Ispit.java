package Domaci_30_05_22;

public class Ispit {

    //Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet

    private String predmet;
    private int ocena;
    private String profesor;

//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute

    public Ispit() {
    }

    public Ispit(String predmet, int ocena, String profesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)

    public boolean daLiJeIspitPolozen ()

    {if (this.ocena>5 && this.ocena<=10)
    {return true;}
        else {return false;}

    }

//metodu koja stampa ispit u formatu:

//(naziv predmeta) - (profesor) - (ocena)

    public void stampa ()
    {
        System.out.println("Naziv predmeta: " + this.predmet +
                " - Profesor "+ this.profesor + " - Ocena " + this.ocena);
    }



}