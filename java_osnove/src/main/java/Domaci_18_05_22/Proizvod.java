package Domaci_18_05_22;

public class Proizvod {

    //Napisati klasu Proizvod koja ima atribute
    //naziv proizvoda (String)
    //cenu proizvoda (double)
    //težinu proizvoda u gramima. (double)
    //	i metode:
    //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
    //
    //
    //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

    String nazivProizvoda;
    double cenaProizvoda;
    double tezinaproizvoda_gr;


    public void stampaj(){
        System.out.print(this.nazivProizvoda +", "+this.cenaProizvoda + ", " );
        System.out.println(this.tezinaproizvoda_gr);
    }
}
