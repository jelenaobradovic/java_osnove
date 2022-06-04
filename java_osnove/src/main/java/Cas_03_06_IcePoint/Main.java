package Cas_03_06_IcePoint;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //U glavnom programu kreirati niz proizvoda
        // od 3 IcePinta i 2 Pice. Svakom proizvodu dodati
        // po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

        Dodatak d1 = new Dodatak("Cokolada", 25);
        Dodatak d2 = new Dodatak("jagoda",30);
        Dodatak d3 = new Dodatak("lesnik", 40);
        Dodatak d4 = new Dodatak("pavlaka",30);
        Dodatak d5 = new Dodatak("sunka", 50);
        Dodatak d6 = new Dodatak("origano", 10);
        Dodatak d7 = new Dodatak("sir", 45);

        Ice_Point ic1 = new Ice_Point("vanila",true);
        ic1.ubaciDodatak(d1);
        ic1.ubaciDodatak(d3);



        Ice_Point ic2 = new Ice_Point("cokolada", false);
        ic2.ubaciDodatak(d2);
        ic2.ubaciDodatak(d3);

        Ice_Point ic3= new Ice_Point("vanila", true);
        ic3.ubaciDodatak(d2);

        Pica p1 = new Pica(50);
        p1.ubaciDodatak(d7);

        Pica p2 = new Pica(60);
        p2.ubaciDodatak(d6);




         ArrayList <Proizvod> porudzbina = new ArrayList<>();
        porudzbina.add(p1);
        porudzbina.add(ic1);
        double suma=0;
        for (int i = 0; i < porudzbina.size(); i++) {
            suma= suma + porudzbina.get(i).ukupnaCena();



        }

        p1.stampaj();
        ic1.stampaj();
        System.out.println();
        System.out.println("Racun: " + suma);


    }
}
