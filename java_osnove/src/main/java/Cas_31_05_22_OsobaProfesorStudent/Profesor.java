package Cas_31_05_22_OsobaProfesorStudent;

public class Profesor extends Osoba{
    //
//    Kreirati klasu Profesor koja nasledjuje klasu Osoba,
//    koja od dodatnih atributa ima:
//    naziv predmeta koji predaje
//    iznos plate
//    konstuktor sa parametrima
//    metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//    Napisati implementaciju metode stampaj da stampa sve podatke o profesoru

    private String predmet;
    private double plata;

    public Profesor(String imeIPrezime, String jMBG, String predmet, double plata) {
        super(imeIPrezime, jMBG);
        this.predmet = predmet;
        this.plata = plata;
    }

    public Profesor(String imeIPrezime, String jMBG) {
        super(imeIPrezime, jMBG);
    }

    public void povecajPlatu (int procenatPovecanja)
    {this.plata=this.plata + this.plata*procenatPovecanja/100;}

    @Override

    public void stampaj ()
    {super.stampaj();
        System.out.println("Plata: "+ this.plata);
        System.out.println("Predmet:" + this.predmet);
    }


}
