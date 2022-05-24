package Cas_16_05_22_metode;

public class zadatak_4 {
    public static void main(String[] args) {
        //
//        4. Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
//        za dva prosledjena broja. Brojevi su ulazni parametri funkcije.
//        U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.
//
int x= 2;
int y=3;
      operacija(x, y);

      //bitno je da se promenljive gadjaju po tipu,
        // nije bitno kako se zovu, u metodi su a i b,
        // ali su one formirane samo ya metodu, a mi pozivom stavimo x i y
    }

    static void operacija (int a, int b){
        System.out.println("Zbir je" + (a+b));
        System.out.println("Razlika je: "+ (a-b));
        System.out.println("Kolicnik je: "+ (a*b));
        System.out.println("Kolicnik je: " + 1.0*a/b);

    }

}

