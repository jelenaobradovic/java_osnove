package Cas_31_05_22_nasledjivanje;

public class OsobaPrStMain {
    public static void main(String[] args) {




    Student student1 = new Student("Jelena Obradovic", "2602984", 2565, 10000);
    Student student2 = new Student("Ana Petrovic", "2605988", 123, 2000);

    Profesor profesor1= new Profesor("Petar Petrovic", "1612966", "farmakologija", 60000);
    Profesor profesor2 = new Profesor("Nikola Nikolic", "1212950", "hemija", 70000);

    profesor2.stampaj();
    profesor2.povecajPlatu(15);
    profesor2.stampaj();

    }
}
