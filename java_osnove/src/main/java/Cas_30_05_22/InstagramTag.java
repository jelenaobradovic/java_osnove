package Cas_30_05_22;

public class InstagramTag {
    //Kreiarti klasu InstagramTag koja ima:
    //x koordinatu na slici
    //y koordinatu na slici
    //usera koji je tagovan

    private int xKoordinata;
    private int yKoordinata;
    private InstagramUser userTagovan;

    public InstagramTag(int xKoordinata, int yKoordinata, String userTagovan) {
        this.xKoordinata = xKoordinata;
        this.yKoordinata = yKoordinata;

    }

    public InstagramTag() {
    }

    public int getxKoordinata() {
        return xKoordinata;
    }

    public void setxKoordinata(int xKoordinata) {
        this.xKoordinata = xKoordinata;
    }

    public int getyKoordinata() {
        return yKoordinata;
    }

    public void setyKoordinata(int yKoordinata) {
        this.yKoordinata = yKoordinata;
    }}



