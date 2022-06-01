package Cas_30_05_22;

import java.util.ArrayList;

public class InstagramImage {
    //Kreirati klasu InstagramImage koja ima:
    //niz tagova
    //dimenziju slike
    //putanju do slike (npr: instagram.com/korsnik-pera/profilna.jpg)
    //metodu dodajTag

    private String dimenzijaSlike;
    private String putanjaDoSlike;
    private ArrayList <InstagramTag> nizTagova= new ArrayList<>();

    public InstagramImage(String dimenzijaSlike, String putanjaDoSlike) {
        this.dimenzijaSlike = dimenzijaSlike;
        this.putanjaDoSlike = putanjaDoSlike;
    }

    public InstagramImage() {
    }

    public String getDimenzijaSlike() {
        return dimenzijaSlike;
    }

    public void setDimenzijaSlike(String dimenzijaSlike) {
        this.dimenzijaSlike = dimenzijaSlike;
    }

    public String getPutanjaDoSlike() {
        return putanjaDoSlike;
    }

    public void setPutanjaDoSlike(String putanjaDoSlike) {
        this.putanjaDoSlike = putanjaDoSlike;
    }

    public ArrayList<InstagramTag> getNizTagova() {
        return nizTagova;
    }

    public void setNizTagova(ArrayList<InstagramTag> nizTagova) {
        this.nizTagova = nizTagova;
    }

    public void dodajTag (InstagramTag user)
    {this.nizTagova.add(user);}

}
