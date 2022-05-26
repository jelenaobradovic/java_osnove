package Domaci_23_05_22;

public class ProizvodVagaMain {
    public static void main(String[] args) {

        Proizvod cokolada = new Proizvod("1234","cokolada", 2000);


        Proizvod lesnik = new Proizvod("222", "lesnik", 2500);

        Vaga merenje1 = new Vaga();
        merenje1.setProizvod(cokolada);
        merenje1.setMernaJedinica("lb");

        Vaga merenje2 = new Vaga();
        merenje2.setProizvod(cokolada);
        merenje2.setMernaJedinica("kg");

        Vaga merenje3 = new Vaga();
        merenje3.setProizvod(lesnik);
        merenje3.setMernaJedinica("lb");

        double tezina1 = 0.2;


        merenje1.stampaRacuna(tezina1, merenje1.getMernaJedinica());


    }
}
