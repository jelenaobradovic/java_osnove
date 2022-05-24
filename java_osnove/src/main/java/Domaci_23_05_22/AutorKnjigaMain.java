package Domaci_23_05_22;

public class AutorKnjigaMain {
    public static void main(String[] args) {
        //	U glavnom programu napraviti vise autora sa vise knjiga.

        Autor ivanIlic = new Autor("Ivan", "Ilic");
        Autor jovanJovic = new Autor("Jovan", "Jovic");
        Autor petarPetrovic = new Autor("Petar", "Petrovic");

        Knjiga vetar = new Knjiga("1234", "Vetar", 1985, ivanIlic);

        Knjiga more = new Knjiga("2234", "More", 1988, ivanIlic);

        Knjiga pesme = new Knjiga();
        pesme.setAutor(jovanJovic);
        pesme.setGodinaIzdanja(1999);
        pesme.setNaziv("Pesme");
        pesme.setiSBN("5555");

        vetar.stampa();
        System.out.println();

        more.stampa();
        System.out.println();

        pesme.stampa();
        System.out.println();
    }
}
