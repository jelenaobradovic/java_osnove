package Cas_30_05_22;

import java.util.ArrayList;

public class InstagramPost {
    //Kreirati klasu InstagramPost koja ima
    //niz slika
    //Opis koji moze da se postavi za post
    //metodu dodajSliku

    private ArrayList<InstagramImage> nizSlika= new ArrayList<>();
    private String opisPosta;

    public InstagramPost(String opisPosta) {
        this.opisPosta = opisPosta;
    }

    public InstagramPost() {
    }

    public ArrayList<InstagramImage> getNizSlika() {
        return nizSlika;
    }

    public void setNizSlika(ArrayList<InstagramImage> nizSlika) {
        this.nizSlika = nizSlika;
    }

    public String getOpisPosta() {
        return opisPosta;
    }

    public void setOpisPosta(String opisPosta) {
        this.opisPosta = opisPosta;
    }

    public void dodajSliku (InstagramImage slika)
    {this.nizSlika.add(slika);}
}
