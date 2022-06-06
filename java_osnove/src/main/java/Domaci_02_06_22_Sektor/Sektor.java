package Domaci_02_06_22_Sektor;

public class Sektor {
    //Kreirati klasu Sektor koja ima:
    // naziv sektora
    // platu koja je za taj sektor

    private String naziv;
    private double plata;


    public Sektor(String naziv, double plata) {
        this.naziv = naziv;
        this.plata = plata;
    }

    public String getNaziv() {
        return naziv;
    }




    public double getPlata() {
        return plata;
    }


}
