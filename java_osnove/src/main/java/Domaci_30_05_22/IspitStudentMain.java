package Domaci_30_05_22;

public class IspitStudentMain {
    public static void main(String[] args) {

        Ispit farmakologija = new Ispit("farmakologija", 8, "Varagic");

        Ispit farmHemija = new Ispit("farmaceutska hemija", 7, "Jasmina Tomin");

        Ispit farmakognozija = new Ispit("Farmakognozija", 9, "D. Kitic");


        Student student1 = new Student(1056, "Jelena Obradovic", "osnovne");

        student1.dodajIspit(farmakognozija);
        student1.dodajIspit(farmHemija);
        student1.dodajIspit(farmakologija);

        farmakognozija.stampa();
        System.out.println(student1.prosekPolozenihIspita());

        student1.stampa();
    }
}
