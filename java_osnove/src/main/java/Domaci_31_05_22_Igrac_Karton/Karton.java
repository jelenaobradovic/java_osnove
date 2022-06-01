package Domaci_31_05_22_Igrac_Karton;

public class Karton {
    //2. Zadatak
    //Kreirati klasu Karton koja ima:
    //tip kartona (crveni, zuti)

    private String tipKartona;

    //konstuktore za koje mislite da ce vam trebati
    //gettere i settere za karton


    public Karton(String tipKartona) {
        this.tipKartona = tipKartona;
    }

    public String getTipKartona() {
        return tipKartona;
    }

    public void setTipKartona(String tipKartona) {
        this.tipKartona = tipKartona;
    }
}