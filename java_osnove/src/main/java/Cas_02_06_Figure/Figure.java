package Cas_02_06_Figure;

public abstract class Figure {

    //Kreirati abstraktnu klasu Figura koja ima

    public abstract double povrsina ();
    public abstract double obim();
    public void stampaj ()
    {
        System.out.println("Povrsina: "+this.povrsina());
        System.out.println("Obim: "+ this.obim());
    }
    //abstraktnu metodu povrsina
    //abstraktnu metodu obim
    //metodu koja stampa podatke u formatu:
    //Povrsina je (povrsina)
    //Obim je (obim)
}
