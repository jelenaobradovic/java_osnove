package Cas_31_05_22_OsobaProfesorStudent;

public class Student extends Osoba {
    //Kreirati klasu Student koja nasledjuje klasu Osoba,
    //			koja od dodatnih atributa ima:
    //broj indeksa
    //dug za skolarinu
    //konstuktor sa parametrima
    //metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost.
    // Metoda prima iznos uplate kao parametar metode.
    //Napisati implementaciju metode stampaj da stampa sve podatke o studentu
    private int brojIndexa;
    private int dugZaSkolarinu;

    public Student(String imeIPrezime, String jMBG, int brojIndexa, int dugZaSkolarinu) {
        super(imeIPrezime, jMBG);
        this.brojIndexa = brojIndexa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public void uplatiSkolarinu(int uplata) {
        if (uplata <= this.dugZaSkolarinu) {
            this.dugZaSkolarinu = this.dugZaSkolarinu - uplata;
        } else {
            System.out.println("Uplata je veca od duga za skolarinu.");
        }
    }

    @Override
    public void stampaj ()
    {super.stampaj();
        System.out.println("Index: "+ this.brojIndexa);
        System.out.println("Dug za skolarinu:"+ this.dugZaSkolarinu);
    }


}
