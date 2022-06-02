package Cas_02_06_Figure;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//U glavnoj klasi kreirati niz od 5 figura
// (2 trougla, 3 pravougaonika) zatim sabrati
// sve povrsine i obime i za svaku figuru ispisati ponaosob

  Figure f1= new JednakostranicniTrougao(12.2);
  Figure f2= new JednakostranicniTrougao(15.3);

  Figure f3 = new Pravougaonik(10,16.3);
  Figure f4 = new Pravougaonik(12.3,14);

        ArrayList<Figure> figure = new ArrayList<>();
        figure.add(f1);
        figure.add(f3);
        figure.add (f2);

        double suma=0;
        for (int i = 0; i <figure.size() ; i++) {
            suma=suma+figure.get(i).obim();

        }
        System.out.println(suma);
    }
}
