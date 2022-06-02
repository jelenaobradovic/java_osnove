package Cas_02_06_Figure;

public class JednakostranicniTrougao extends Figure {

    public double stranica;
    //Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
    //stranicu a

    public JednakostranicniTrougao(double stranica) {
        this.stranica = stranica;
    }

    public JednakostranicniTrougao() {
    }

    public double getStranica() {
        return stranica;
    }

    public void setStranica(double stranica) {
        this.stranica = stranica;
    }

    @Override
    public double povrsina() {
        return  (this.stranica* this.stranica) * 1.73205 / 4;
    }

    @Override
    public double obim() {
        return 3*this.stranica;
    }
//gettere/settere/konstruktore
    //implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
    //implementira metodu obim
}
