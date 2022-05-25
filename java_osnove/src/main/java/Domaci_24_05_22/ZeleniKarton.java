package Domaci_24_05_22;

public class ZeleniKarton {

    //Kreirati klasu ZeleniKarton koja ima:
    //ime i prezime studenta
    //broj indeksa
    //naziv predmeta
    //ime i prezime profesora
    //ocenu - od 5 do 10
    //gettere i settere konstruktore


    private String imeIprezimeStudenta;
    private int brojIndexa;
    private String predmet;
    private String imeIPrezimeProfesora;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String imeIprezimeStudenta, int brojIndexa, String predmet, String imeIPrezimeProfesora, int ocena) {
        this.imeIprezimeStudenta = imeIprezimeStudenta;
        this.brojIndexa = brojIndexa;
        this.predmet = predmet;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
        this.ocena = ocena;
    }

    public String getImeIprezimeStudenta() {
        return imeIprezimeStudenta;
    }

    public void setImeIprezimeStudenta(String imeIprezimeStudenta) {
        this.imeIprezimeStudenta = imeIprezimeStudenta;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime
    //(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
    //(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

    public boolean prelaznaOcena() {
        if (this.ocena > 5 && this.ocena < 10) {
            return true;
        } else {
            return false;
        }
    }

public void stampa ()
{
    System.out.println(this.predmet + " - " + this.ocena);
    System.out.println("Student: " + this.imeIprezimeStudenta + ", "+ this.brojIndexa);
    System.out.println("Profesor: " + this.imeIPrezimeProfesora);
}


}
