package Cas_02_06_Figure;

public class Pravougaonik extends Figure{
    //Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
    //stranice a i b
    private double stranicaA;
    private double stranicaB;


    //gettere/settere/konstruktore

    public Pravougaonik(double stranicaA, double stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    public Pravougaonik() {
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {
        return this.stranicaA*this.stranicaB/2;
    }

    @Override
    public double obim() {
        return (2*this.stranicaB+2*this.stranicaA);
    }
    //implementira metodu povrsina
    //implementira metodu obim



}
