package Domaci_18_05_22;

public class SmartAirConditioning {
    //Kreirati klasu SmartAirConditioning koja ima:
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)
    //metodu za stampu - stampa u formatu: Proizvoljno :)
    //
    //
    //U glavnom programu kreirati minimum 2 objekta klase
    // SmartAirConditioning i za svaki od njih pozvati metodu za stampu

    String marka;
    int temperatura;
    String mode;


    public void stampa() {
        System.out.print("Klima je marke " + this.marka + " i sa izabranom temperaturom " + this.temperatura);
        System.out.println(" i postavljena je na mode-" + this.mode + ".");
    }


}
