package d_16_05_2022;

public class zadatak_3 {
    public static void main(String[] args) {
        //Zadatak
        //Napisati metodu koja stampa podatke
        // o korisniku u formatu:
        //JMBG: [jmbg]
        //Ime: [ime]
        //Prezime: [prezime]
        //God. rodjenja: [god]
        //Aktivan: [true/false]
        //Metoda prima jmbg, ime, prezime,
        // god rodjenja i da li je aktivan kao parametre metode.

        String jMBG = "26262626262626";
        String ime = "Jelena";
        String prezime = "Obradovic";
        String godinaRodjenja = "1984";
        boolean aktivan = true;

        podaciOKorisniku(jMBG, ime, prezime, godinaRodjenja, aktivan);
    }

    static void podaciOKorisniku(String a, String b, String c, String d, boolean e) {
        System.out.println("JMBG: " + a);
        System.out.println("Ime: " + b);
        System.out.println("Prezime: " + c);
        System.out.println("Godina rodjenja: " + d);
        System.out.println("Aktivan: " + e);

    }
}
