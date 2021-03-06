package Domaci_19_05_22;

public class Proizvod {

    //Napisati klasu Proizvod koja ima atribute
    //naziv proizvoda (String)
    //cenu proizvoda (double)
    //težinu proizvoda u gramima. (double)
    //	i metode:
    //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
    //povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju
    // treba povećati cenu. Ova funkcija treba da menja atribut cena i ova
    // funkcija nema povratnu vrednost.
    //vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
    // a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije
    // ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
    //racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod
    // šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena
    // postarine se računa u zavisnosti od tezine:
    //za tezinu do 100g, postarina iznosi 200din
    //za tezinu od 101g do 500g, postarina iznosi 400din
    //za tezinu preko 500g, postarina iznosi 1000din
    //
    //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

    String nazivProizvoda;
    double cenaProizvoda;
    double tezinaproizvoda_gr;


    public void stampaj(){
        System.out.print(this.nazivProizvoda +", "+this.cenaProizvoda + ", " );
        System.out.println(this.tezinaproizvoda_gr);
    }

    public void povecajCenu (double povecanjeCeneZa)
    {this.cenaProizvoda=this.cenaProizvoda+povecanjeCeneZa;}

    public double vratiCenuSaPopustom (int popust)
    {return this.cenaProizvoda*popust/100;}

    public void racunajPostarinu () {
        if (this.tezinaproizvoda_gr <= 100)
        {
            System.out.println("Postarina inosi 200 din ");
        }
        else if (this.tezinaproizvoda_gr>100 && this.tezinaproizvoda_gr<=500)
        {
            System.out.println("Postarina iznosi 400din");
        }
        else {
            System.out.println("Postarina iznosi 600din");
        }

    }





}
